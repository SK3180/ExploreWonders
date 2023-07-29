package com.sksingh.explorewonders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class booking extends AppCompatActivity {
    ImageView book;
    EditText name,email,phone;
    TextView Success;
    ImageView tick,home;
    private  boolean Switch = false;
    LottieAnimationView firework;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        book = findViewById(R.id.booking);
        firework = findViewById(R.id.firework);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        tick = findViewById(R.id.booked);
        Success = findViewById(R.id.sucess);
        home = findViewById(R.id.home);


        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                name.setVisibility(View.GONE);
                email.setVisibility(View.GONE);
                phone.setVisibility(View.GONE);
                tick.setVisibility(View.VISIBLE);
                Success.setVisibility(View.VISIBLE);


                firework.playAnimation();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(booking.this, Home.class);
                startActivity(home);
                home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            }
        });


    }
}