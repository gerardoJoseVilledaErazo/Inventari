package com.example.inventari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
/*
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {

                }catch (Exception e){

                }finally {

                }
            }
        };
        thread.start();*/

        //fab = (Button) findViewById(R.id.floating_action_button);

        //fab.setOnClickListener(v -> {
            // Respond to FAB click
            // startActivity(new Intent(MainActivity.this, .class));
        //});

        
    }
/*
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }*/
}