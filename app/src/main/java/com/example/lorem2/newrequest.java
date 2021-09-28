package com.example.lorem2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class newrequest extends AppCompatActivity {

 ListView listView;
    private Object ArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newrequest);

        listView=(ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Request 1");
        arrayList.add("Request 2");
        arrayList.add("Request 1");
        arrayList.add("Request 2");
        arrayList.add("Request 1");
        arrayList.add("Request 2");
        arrayList.add("Request 1");
        arrayList.add("Request 2");
        arrayList.add("Request 1");
        arrayList.add("Request 2");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter((ListAdapter) ArrayAdapter);

    }
}