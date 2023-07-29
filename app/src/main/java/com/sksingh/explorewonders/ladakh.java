package com.sksingh.explorewonders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ladakh extends AppCompatActivity {
    ImageView l,l1,l2,l3,l4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladakh);

        l = findViewById(R.id.ladakh);
        l1 = findViewById(R.id.ladakh1);
        l2 = findViewById(R.id.ladakh2);
        l3 = findViewById(R.id.ladakh3);
        l4 = findViewById(R.id.ladakh4);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setImageResource(R.drawable.ladakh1);

            }
        });
        l2.setOnClickListener(view -> l.setImageResource(R.drawable.ladakh5));
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setImageResource(R.drawable.ladakh3);

            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setImageResource(R.drawable.ladakh4);

            }
        });
        
    }
}