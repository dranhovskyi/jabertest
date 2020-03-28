package com.example.jabbercheckevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private MyBroadcastReceiver MyReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyReceiver = new MyBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter("com.cisco.im");
        if(intentFilter != null)
        {
            registerReceiver(MyReceiver, intentFilter);
        }
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if(MyReceiver != null)
            unregisterReceiver(MyReceiver);
    }
}
