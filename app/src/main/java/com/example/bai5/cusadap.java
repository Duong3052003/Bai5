package com.example.bai5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class cusadap extends ArrayAdapter<nhanvien> {
    Activity context;
    ArrayList<nhanvien> arrNv;
    int layoutID;
    public cusadap(@NonNull Activity context, int resource, ArrayList<nhanvien> arrNv) {
        super(context, resource, arrNv);
        this.context = context;
        this.arrNv = arrNv;
        this.layoutID = resource;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView=inflater.inflate(layoutID,null);
        TextView t =convertView.findViewById(R.id.textView);
        t.setText(arrNv.get(position).toString());
        return convertView;
    }
}
