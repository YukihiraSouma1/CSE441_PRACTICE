package com.example.ex07_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        btn = findViewById(R.id.btnNavigate);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SubActivity.class);
            startActivity(intent);
        });




    }
}