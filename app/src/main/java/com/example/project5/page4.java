package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class page4 extends AppCompatActivity {

    private ImageView imageView4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        imageView4 = findViewById(R.id.imageView4);
        Glide.with(page4.this)
                .load("https://img.freepik.com/premium-vector/thai-tea-drink-promotion-instagram-post_737924-29.jpg?size=626&ext=jpg&uid=R116774952&semt=ais")
                .into(imageView4);


    }
}