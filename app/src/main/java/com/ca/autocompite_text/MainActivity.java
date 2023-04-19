package com.ca.autocompite_text;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView auto_text;
ArrayList<String> arrayList=new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auto_text=findViewById(R.id.auto_text);

        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("C#");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("phy");
        arrayList.add("Pat");
        arrayList.add("juuvo");
        arrayList.add("jov");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
        auto_text.setAdapter(arrayAdapter);
        auto_text.setThreshold(1);
    }
}