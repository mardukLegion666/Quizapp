package com.example.android.quizapp;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
        Button button;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // Get the view from activity_main.xml
            setContentView(R.layout.activity_main);

            // Locate the button in activity_main.xml
            button = (Button) findViewById(R.id.bavarian_sights);

            // Capture button clicks
            button.setOnClickListener(new OnClickListener() {
                public void onClick(View arg0) {

                    // Start NewActivity.class
                    Intent myIntent = new Intent(MainActivity.this,
                            BavarianSights.class);
                    startActivity(myIntent);
                }
            });


        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.bavarian_traditions);


        // Capture button clicks
            button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        BavarianTraditions.class);
                startActivity(myIntent);
            }
        });

    }


    }
