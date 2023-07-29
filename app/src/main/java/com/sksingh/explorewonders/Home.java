package com.sksingh.explorewonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    ImageView golden,taj,mysore,kerala,ladakh;
    ImageView explore;
    ImageView mysorecate,tajmahalcate,ladakhcate,goldencate,keralacate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        golden = findViewById(R.id.goldentemple);
        taj = findViewById(R.id.tajagra);
        mysore = findViewById(R.id.mysore);
        kerala = findViewById(R.id.kerala);
        mysorecate = findViewById(R.id.mysorecate);
        ladakh = findViewById(R.id.ladhakk);
        tajmahalcate = findViewById(R.id.tajmahalcate);
        keralacate = findViewById(R.id.keralacate);
        ladakhcate = findViewById(R.id.ladhakcate);
        goldencate = findViewById(R.id.goldencate);
        explore = findViewById(R.id.explore);

        golden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gold = new Intent(Home.this,golden.class);
                startActivity(gold);
            }
        });
        goldencate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goldcate = new Intent(Home.this,golden.class);
                startActivity(goldcate);
            }
        });
        taj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent taj = new Intent(Home.this,tajmahal.class);
                startActivity(taj);
            }
        });
        tajmahalcate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tajmahal = new Intent(Home.this,tajmahal.class);
                startActivity(tajmahal);
            }
        });
        mysore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mysore = new Intent(Home.this,mysore.class);
                startActivity(mysore);
            }
        });
        mysorecate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mysorecate = new Intent(Home.this,mysore.class);
                startActivity(mysorecate);
            }
        });
        kerala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kerala = new Intent(Home.this,kerala.class);
                startActivity(kerala);
            }
        });
        keralacate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keralacate = new Intent(Home.this,kerala.class);
                startActivity(keralacate);
            }
        });
        ladakh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ladhak = new Intent(Home.this,kerala.class);
                startActivity(ladhak);
            }
        });
        ladakhcate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ladhakcate = new Intent(Home.this,kerala.class);
                startActivity(ladhakcate);
            }
        });
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explore = new Intent(Home.this,explore.class);
                startActivity(explore);
            }
        });


    }

}