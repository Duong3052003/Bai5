package com.example.bai5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class spinnertest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinnertest);
        Spinner sp= findViewById(R.id.spr);
        EditText e = findViewById(R.id.edt);
        EditText e2 = findViewById(R.id.edt1);
        Button b = findViewById(R.id.btn);
        ListView lv=findViewById(R.id.lv);
        String sp1="Iphone";
        String sp2="SamSung";
        ArrayList<String> a = new ArrayList<>();
        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,a);
        lv.setAdapter(a2);
        ArrayList<String> b1 = new ArrayList<>();
        ArrayAdapter<String> b2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,b1);
        lv.setAdapter(b2);
        ArrayList<String> arr = new ArrayList<>();
        arr.add(sp1);
        arr.add(sp2);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String select = sp.getSelectedItem().toString();
                    String s = e.getText().toString() + "-" + select + "-" + e2.getText().toString();
                    if(sp.isSelected()) {
                        a.add(s);
                        a2.notifyDataSetChanged();
                    }else {
                        b1.add(s);
                        b2.notifyDataSetChanged();
                    }
                }
            }
        });
    }
}