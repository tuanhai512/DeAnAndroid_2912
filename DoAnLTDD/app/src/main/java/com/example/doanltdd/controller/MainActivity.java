package com.example.doanltdd.controller;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doanltdd.R;
import com.example.doanltdd.adapter.ExerciseAdapter;
import com.example.doanltdd.adapter.ExerciseHardAdapter;
import com.example.doanltdd.adapter.ExerciseMediumAdapter;
import com.example.doanltdd.adapter.ListDataAdapter;
import com.example.doanltdd.model.Exercise;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ListView listView;
    ListDataAdapter listDataAdapter;
    RecyclerView rvData,rvData1,rvData2,rvData3;
  // ExerciseAdapter exerciseAdapter;
   // MyAdapter myAdapter;
   // ArrayList<Contact> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvData = findViewById(R.id.rcv_Data);
        rvData1 = findViewById(R.id.rcv_item);
        rvData2 = findViewById(R.id.rcv_item1);
        rvData3 = findViewById(R.id.rcv_item2);

        listDataAdapter = new ListDataAdapter();

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navView);
        toolbar = findViewById(R.id.toolbar);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.info) {
                    Toast.makeText(getApplicationContext(), "Thông tin", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (item.getItemId() == R.id.setup) {
                    Toast.makeText(getApplicationContext(), "Cài đặt", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }


                return false;
            }
        });

        acctionToolBar();


        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
       // rvData.setLayoutManager(linearLayoutManager);

        ExerciseAdapter exerciseAdapter = new ExerciseAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvData1.setLayoutManager(linearLayoutManager);
        rvData1.setFocusable(false);
        rvData1.setNestedScrollingEnabled(false);
        exerciseAdapter.setData(getlistExcercise());
        rvData1.setAdapter(exerciseAdapter);

        ExerciseHardAdapter exerciseHardAdapter = new ExerciseHardAdapter();
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvData2.setLayoutManager(linearLayoutManager1);
      //  rvData2.setFocusable(false);
        rvData2.setHasFixedSize(true);
        exerciseHardAdapter.setData(getlistExcerciseHard());
        rvData2.setAdapter(exerciseHardAdapter);

        ExerciseMediumAdapter exerciseMediumAdapter = new ExerciseMediumAdapter();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
        rvData3.setLayoutManager(linearLayoutManager2);
        rvData3.setFocusable(false);
        rvData3.setNestedScrollingEnabled(false);
        exerciseMediumAdapter.setData(getlistExcerciseMedium());
        rvData3.setAdapter(exerciseMediumAdapter);

        listView = findViewById(R.id.listView);

//        rvData.setAdapter(listDataAdapter);

    }

    private List<Exercise> getlistExcerciseHard() {
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(new Exercise(R.drawable.body2,"abc"));
        exerciseList.add(new Exercise(R.drawable.body3,"abc"));
        exerciseList.add(new Exercise(R.drawable.body2,"abc"));


        return exerciseList;
    }

    private List<Exercise> getlistExcercise() {
        List<Exercise> exerciseList1 = new ArrayList<>();
        exerciseList1.add(new Exercise(R.drawable.body2,"abc"));
        exerciseList1.add(new Exercise(R.drawable.body3,"abc"));
        exerciseList1.add(new Exercise(R.drawable.body2,"abc"));


        return exerciseList1;

    }
    private List<Exercise> getlistExcerciseMedium() {
        List<Exercise> exerciseList2 = new ArrayList<>();
        exerciseList2.add(new Exercise(R.drawable.body2,"abc"));
        exerciseList2.add(new Exercise(R.drawable.body3,"abc"));
        exerciseList2.add(new Exercise(R.drawable.body2,"abc"));


        return exerciseList2;

    }



    private void acctionToolBar() {
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_dehaze_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
}



