package com.example.prac03;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter  extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>{




    private List<country> countryList;

    public CountryAdapter(List<country> countryList) {
        this.countryList = countryList;
    }


    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_country,parent,false);
        return new CountryViewHolder(view);
    }


    @NonNull


    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        country country = countryList.get(position);
        holder.flag.setImageResource(country.getFlagId());
        holder.name.setText(country.getName());
        holder.capital.setText(country.getCapital());

        holder.itemView.setOnClickListener(v -> {
            country country1 = countryList.get(position);
            Intent intent = new Intent(v.getContext(), detail.class);
            intent.putExtra("countryName", country1.getName());
            intent.putExtra("capital", country1.getCapital());
            intent.putExtra("flag", country1.getFlagId());
            v.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {
        ImageView flag;
        TextView name;
        TextView capital;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flagImageView);
            name = itemView.findViewById(R.id.countryNameTextView);
            capital = itemView.findViewById(R.id.capitalTextView);
        }
    }
}
