package com.example.ex13_1;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<ContactsContract.CommonDataKinds.Phone> {
    Activity mContext;
    int idLayout;
    List<ContactsContract.CommonDataKinds.Phone> phoneList;

    public MyArrayAdapter( Activity mContext,  int idLayout, List<ContactsContract.CommonDataKinds.Phone> phoneList) {
        super(mContext, idLayout,phoneList);
        this.mContext = mContext;
        this.idLayout = idLayout;
        this.phoneList = phoneList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup
            parent) {
        LayoutInflater myInflactor = mContext.getLayoutInflater();
        convertView = myInflactor.inflate(idLayout,null);
        ContactsContract.CommonDataKinds.Phone myphone = phoneList.get(position);
        ImageView imgphone = convertView.findViewById(R.id.img_thumb);
        imgphone.setImageResource(myphone.getClass().getModifiers());
        TextView txtnamephone = convertView.findViewById(R.id.txt_name);
        txtnamephone.setText(myphone.getClass().getModifiers());
        return convertView;
    }

}
