package com.example.bai5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Bai5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai5);
        ListView l = findViewById(R.id.lv);
        EditText e = findViewById(R.id.edt);
        EditText e1 = findViewById(R.id.edt1);
        Button b = findViewById(R.id.btn);
        Button b1 = findViewById(R.id.btn2);
        TextView t = findViewById(R.id.tt);
            ArrayList<nhanvien> arrNv = new ArrayList<>();
            cusadap ad = new cusadap(this, R.layout.item, arrNv);
            ListView listView=findViewById(R.id.lv);
            listView.setAdapter(ad);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    RadioGroup r = findViewById(R.id.rg);
                    RadioButton radioButton = findViewById(r.getCheckedRadioButtonId());
                    if(r.getCheckedRadioButtonId()==-1){
                        Toast.makeText(Bai5.this,"hay chon sex",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    nhanvien nv = new nhanvien(e.getText().toString(), e1.getText().toString());
                    arrNv.add(nv);
                    ad.notifyDataSetChanged();
                    e1.setText("");
                    e.setText("");
                }
            });
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    for(int i=l.getChildCount()-1;i>=0;i--){
                        View v = l.getChildAt(i);
                        CheckBox c =v.findViewById(R.id.checkBox);
                        if(c.isChecked()){
                            arrNv.remove(i);
                        }
                    }
                    ad.notifyDataSetChanged();
                }
            });
    }
}