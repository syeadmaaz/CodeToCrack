package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button proceed = (Button) findViewById(R.id.button);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"--onStart--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"--onRestart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"--onResume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"--onPause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"--onStop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"--onDestroy--");
    }

}
