package com.example.twoactivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d( "SecondActivity", "in SecondActivity onCreateMethod")
    }
}
