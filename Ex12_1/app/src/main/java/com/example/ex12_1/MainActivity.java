package com.example.ex12_1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private ListView lvPhone;
    private TextView txtTitle;
    private String[] phones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        phones = getResources().getStringArray(R.array.phones);
        setupViews();
        // logics
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, phones);
        lvPhone.setAdapter(adapter);
        lvPhone.setOnItemClickListener((parent, view, position, id) -> {
            txtTitle.setText("Position: " + position + " - " + phones[position]);
        });
    }

    private void setupViews() {
        lvPhone = findViewById(R.id.lv_phones);
        txtTitle = findViewById(R.id.txt_title);
    }
}