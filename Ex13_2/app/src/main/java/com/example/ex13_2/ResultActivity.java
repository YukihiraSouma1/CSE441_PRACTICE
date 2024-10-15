package com.example.ex13_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    TextView txtViewChoice;
    ImageView imageThumb;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txtViewChoice = findViewById(R.id.txt_name);
        imageThumb = findViewById(R.id.img_thumb);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("name");
        int imgId = bundle.getInt("imgId");

        txtViewChoice.setText(name);
        imageThumb.setImageResource(imgId);




    }
}
