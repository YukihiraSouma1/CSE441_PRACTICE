package com.example.prac03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        ImageView flagImageView = findViewById(R.id.flagImageView);
        TextView countryNameTextView = findViewById(R.id.countryNameTextView);
        TextView capitalTextView = findViewById(R.id.capitalTextView);

        Intent intent = getIntent();
        String countryName = intent.getStringExtra("countryName");
        String capital = intent.getStringExtra("capital");
        int flagResource = intent.getIntExtra("flag", 0);

        countryNameTextView.setText(countryName);
        capitalTextView.setText("Capital: " + capital);
        flagImageView.setImageResource(flagResource);
    }
}