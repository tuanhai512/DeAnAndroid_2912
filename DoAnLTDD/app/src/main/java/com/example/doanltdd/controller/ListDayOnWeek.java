package com.example.doanltdd.controller;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doanltdd.R;
import com.example.doanltdd.adapter.ListDayOnWeekAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListDayOnWeek extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> listGroup;
    HashMap<String,List<String>> listItem;
    ListDayOnWeekAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_day_on_week);

        expandableListView = findViewById(R.id.expandable_listview);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        adapter = new ListDayOnWeekAdapter(this,listGroup,listItem);
        expandableListView.setAdapter(adapter);
        initListData();

    }

    private void initListData() {
        listGroup.add(getString (R.string.group1));
        listGroup.add(getString (R.string.group2));
        listGroup.add(getString (R.string.group3));
        listGroup.add(getString (R.string.group4));

        String[] array;
        List<String> list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for(String item: array)
        {
            list1.add(item);
        }
        List<String> list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for(String item: array)
        {
            list2.add(item);
        }
        List<String> list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for(String item: array)
        {
            list3.add(item);
        }
        List<String> list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for(String item: array)
        {
            list4.add(item);
        }
        listItem.put(listGroup.get(0),list1);
        listItem.put(listGroup.get(1),list2);
        listItem.put(listGroup.get(2),list3);
        listItem.put(listGroup.get(3),list4);
        adapter.notifyDataSetChanged();
    }

}