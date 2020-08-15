package com.example.maxdelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Productos extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        ListView listView = (ListView)findViewById(R.id.listView);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Embutidos");
        arrayList.add("Lacteos");
        arrayList.add("Frutas");
        arrayList.add("Vegetales");
        arrayList.add("Bebidas");
        arrayList.add("Dulces");
        arrayList.add("Detergentes");
        arrayList.add("Belleza");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Productos.this, "Productos:" + i + " " + arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}