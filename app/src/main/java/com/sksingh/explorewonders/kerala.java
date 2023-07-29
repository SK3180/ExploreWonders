package com.sksingh.explorewonders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class kerala extends AppCompatActivity {

    ImageView m,k1,k2,k3,k4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);
        m = findViewById(R.id.m);
        k1 = findViewById(R.id.kerala1);
        k2 = findViewById(R.id.kerala2);
        k3 = findViewById(R.id.kerala3);
        k4 = findViewById(R.id.kerala4);

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.setImageResource(R.drawable.k1);

            }
        });
        k2.setOnClickListener(view -> m.setImageResource(R.drawable.k2));
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.setImageResource(R.drawable.k3);

            }
        });
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.setImageResource(R.drawable.k4);

            }
        });
    }
}