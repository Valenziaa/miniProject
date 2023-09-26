package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class page5 extends AppCompatActivity {
    private ImageView imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        imageView5 = findViewById(R.id.imageView5);

        Glide.with(page5.this)
                .load("https://img.freepik.com/free-vector/brown-sugar-bubble-milk-tea-set-poster-ad-flyer-template-watercolor-illustration_83728-560.jpg?size=626&ext=jpg&uid=R116774952&semt=ais")
                .into(imageView5);
    }
}