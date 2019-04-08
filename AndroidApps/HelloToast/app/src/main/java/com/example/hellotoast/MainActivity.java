package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText =findViewById(R.id.countText);


    }

    public void showToast(View view) {

        Log.d("Main Activity",  "Clicked toast button!");
        //Toast toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG);

    }

    public void showToast(View view) {
    }
}
