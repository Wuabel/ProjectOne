package com.example.zjhzx.projectone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainpageActivity extends AppCompatActivity {
    private static final String TAG = "MainpageActivity";

    private Button mButton_GN;
    private Button mButton_GM;
    private Button mButton_WU;
    private Button mButton_MD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_mainpage);

        mButton_GN = (Button) findViewById(R.id.button_GoodNight);
        mButton_GN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainpageActivity.this,
                        R.string.Button_GN,
                        Toast.LENGTH_SHORT).show();
            }
        });


        mButton_GM = (Button) findViewById(R.id.button_GoodMorning);
        mButton_GM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainpageActivity.this,
                        R.string.Button_GM,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mButton_WU = (Button) findViewById(R.id.button_WakeUp);
        mButton_WU.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainpageActivity.this,
                        R.string.Button_WU,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mButton_MD = (Button) findViewById(R.id.button_MDay);
        mButton_MD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainpageActivity.this,
                        R.string.Button_MD,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

}
