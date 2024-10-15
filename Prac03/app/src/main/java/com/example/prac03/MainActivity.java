package com.example.prac03;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<country> countryList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        initial();
        CountryAdapter adapter = new CountryAdapter(countryList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        Drawable drawable = getDrawable(R.drawable.divider);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(dividerItemDecoration);



    }

    private void initial() {

        recyclerView = findViewById(R.id.recycler_countries);
        countryList = List.of(
                new country("Việt Nam","Hà Nội",R.drawable.vietnam),
                new country("United States","Washington",R.drawable.usa),
                new country("United Kingdom","London",R.drawable.uk),
                new country("France","Paris",R.drawable.france),
                new country("Germany","Berlin",R.drawable.germany),
                new country("Wales","Cardiff",R.drawable.wales),
                new country("Scotland","Edinburgh",R.drawable.indo),
                new country("Ireland","Dublin",R.drawable.japan),
                new country("Australia","Canberra",R.drawable.sing),
                new country("New Zealand","Wellington",R.drawable.china),
                new country("Canada","Ottawa",R.drawable.brazil)
        );



    }
}