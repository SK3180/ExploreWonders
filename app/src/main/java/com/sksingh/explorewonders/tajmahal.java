package com.sksingh.explorewonders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tajmahal extends AppCompatActivity {

    ImageView tm,tm1,tm2,tm3,tm4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajmahal);
        tm = findViewById(R.id.tm);
        tm1 = findViewById(R.id.m1);
        tm2 = findViewById(R.id.m2);
        tm3 = findViewById(R.id.tm3);
        tm4 = findViewById(R.id.tm4);

        tm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tm.setImageResource(R.drawable.tm1);

            }
        });
        tm2.setOnClickListener(view -> tm.setImageResource(R.drawable.tm2));
        tm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tm.setImageResource(R.drawable.tm3);

            }
        });
        tm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tm.setImageResource(R.drawable.tm4);

            }
        });


    }
}