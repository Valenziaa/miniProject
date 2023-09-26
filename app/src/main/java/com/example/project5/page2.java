package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class page2 extends AppCompatActivity {
    private ImageView imageView8;
    private ImageView imageView12;
    private ImageView imageView13;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        imageView8 = findViewById(R.id.greencha);

        Glide.with(page2.this)
                .load("https://img.freepik.com/free-vector/hand-drawn-bubble-tea-flavors_52683-45911.jpg?size=626&ext=jpg&uid=R116774952&semt=ais")
                .into(imageView8);

        imageView12 = findViewById(R.id.thai_tea);

        Glide.with(page2.this)
                .load("https://img.freepik.com/premium-vector/thai-tea-drink-promotion-instagram-post_737924-29.jpg?size=626&ext=jpg&uid=R116774952&semt=ais")
                .into(imageView12);

        imageView13 = findViewById(R.id.brown);

        Glide.with(page2.this)
                .load("https://img.freepik.com/free-vector/brown-sugar-bubble-milk-tea-set-poster-ad-flyer-template-watercolor-illustration_83728-560.jpg?size=626&ext=jpg&uid=R116774952&semt=ais")
                .into(imageView13);

        imageView8 = findViewById(R.id.greencha);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(page2.this, page3.class);
                startActivities(new Intent[]{intent});
            }


        });

        imageView12 = findViewById(R.id.thai_tea);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(page2.this, page4.class);
                startActivities(new Intent[]{intent});
            }


        });

        imageView13 = findViewById(R.id.brown);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(page2.this, page5.class);
                startActivities(new Intent[]{intent});
            }


        });
    }
}