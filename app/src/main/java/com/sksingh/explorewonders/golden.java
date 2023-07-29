package com.sksingh.explorewonders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class golden extends AppCompatActivity {

    ImageView main,gt1,gt2,gt3,gt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golden);
        main = findViewById(R.id.tm);
        gt1 = findViewById(R.id.m1);
        gt2 = findViewById(R.id.m2);
        gt3 = findViewById(R.id.tm3);
        gt4 = findViewById(R.id.tm4);

        gt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setImageResource(R.drawable.gt1);

            }
        });
        gt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setImageResource(R.drawable.gt2);

            }
        });
        gt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setImageResource(R.drawable.gt3);

            }
        });
        gt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setImageResource(R.drawable.gt4);

            }
        });


    }
}