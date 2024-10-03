package com.example.prac01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info);


        findViewById(R.id.button).setOnClickListener(v -> {
            String name = ((EditText) findViewById(R.id.txt_name)).getText().toString();
            String gpa = ((EditText) findViewById(R.id.txt_gpa)).getText().toString();
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("gpa", gpa);
            startActivity(intent);
    });
}
}