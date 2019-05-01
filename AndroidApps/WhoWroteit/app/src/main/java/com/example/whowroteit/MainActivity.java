package com.example.whowroteit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText booktitleRequest;
    private TextView titleResult;
    private TextVIew authorResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookTitleRequest = findViewById(r.id.titletoSearch);
        titleResult= findViewById(R.id.tileResult);
        authorResult= findViewById(R.id.authorResult);
    }

    public void searchTitle(View view) {

        StringbookTitle = booktitleRequest.getText().toString();


    }
    public void playSound(View view){

    }
}
