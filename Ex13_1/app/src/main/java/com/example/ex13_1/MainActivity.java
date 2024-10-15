package com.example.ex13_1;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Phone> phoneList;
    private ListView lvPhones;
    MyArrayAdapter myArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initial();

    }

    private void initial() {
        lvPhones = findViewById(R.id.listView);
        phoneList = List.of(
                new Phone("Iphone 15 Pro Max",R.drawable.image1),
                new Phone("Iphone 12 Pro Max",R.drawable.image2),
                new Phone("Samsung s22 ultra",R.drawable.image3),
                new Phone("HTC 1", R.drawable.image4),
                new Phone("Xiaomi mi 8",R.drawable.image5)
        );
        myArrayAdapter = new MyArrayAdapter(this,R.layout.list_view_item,phoneList);
        lvPhones.setAdapter(myArrayAdapter);

        lvPhones.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this,ResultActivity.class);
            ContactsContract.CommonDataKinds.Phone current = myArrayAdapter.getItem(position);
            intent.putExtra("name",current.getClass());
            startActivity(intent);
        });

    }
}