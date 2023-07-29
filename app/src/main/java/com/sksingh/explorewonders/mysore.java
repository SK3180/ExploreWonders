package com.sksingh.explorewonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mysore extends AppCompatActivity {

    ImageView m,m1,m2,m3,m4;
    ImageView book;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysore);
        m = findViewById(R.id.m);
        m1 = findViewById(R.id.mysore1);
        m2 = findViewById(R.id.mysore2);
        m3 = findViewById(R.id.mysore3);
        m4 = findViewById(R.id.mysore4);
        book = findViewById(R.id.booking);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.setImageResource(R.drawable.m1);

            }
        });
        m2.setOnClickListener(view -> m.setImageResource(R.drawable.m2));
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.setImageResource(R.drawable.m3);

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.setImageResource(R.drawable.m4);

            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent book = new Intent(mysore.this,booking.class);
                startActivity(book);
            }
        });

        
    }
}