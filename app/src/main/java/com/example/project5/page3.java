package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class page3 extends AppCompatActivity {
    private ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        imageView3 = findViewById(R.id.imageView3);

        Glide.with(page3.this)
                .load("https://img.freepik.com/free-vector/hand-drawn-bubble-tea-flavors_52683-45911.jpg?size=626&ext=jpg&uid=R116774952&semt=ais")
                .into(imageView3);


    }
}