package com.sksingh.explorewonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class explore extends AppCompatActivity {
    ImageView home,kochi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        home = findViewById(R.id.home);
        kochi = findViewById(R.id.kochi);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(explore.this,Home.class);
                home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home);

            }
        });
        kochi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kochi = new Intent(explore.this,kerala.class);
                kochi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(kochi);
            }
        });


    }
}