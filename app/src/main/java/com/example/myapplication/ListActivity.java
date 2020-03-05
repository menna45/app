package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView LV = (ListView) findViewById(R.id.listview);
        ArrayList<String> arrayListitems = new ArrayList<>();
        arrayListitems.add("Android");
        arrayListitems.add("iphone");
        arrayListitems.add("windows");
        arrayListitems.add("blackburry");
        arrayListitems.add("linux");
        ArrayAdapter AD = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayListitems);
        ListView.setAdapter(AD);
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
           
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent j = new Intent(view.getContext(), DeviceDetailActivity.class);
                    startActivityForResult(j, 0);
                }
                if (position == 1) {
                    Intent j = new Intent(view.getContext(), DeviceDetailActivity1.class);
                    startActivityForResult(j, 1);
                }
                if (position == 3) {
                    Intent j = new Intent(view.getContext(), DeviceActivity2.class);
                    startActivityForResult(j, 2);
                }

                if (position == 4) {
                    Intent j = new Intent(view.getContext(), DeviceActivity3.class);
                    startActivityForResult(j, 3);
                }

            }
        });


    }
}
