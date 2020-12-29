package com.example.doanltdd.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyAlarm extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        //you can check the log that it is fired
        //Here we are actually not doing anything
        //but you can do any task here that you want to be done at a specific time everyday
        String tag = "Receive";
        Log.d("MyAlarmBelal", "Alarm just fired");
        Log.d("TestReceiver", "intent=" + intent);
        String message = intent.getStringExtra("messgage");
        Log.d(tag, message);
    }
}




