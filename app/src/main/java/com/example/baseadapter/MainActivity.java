package com.example.baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list_view;
    ArrayList<MyModel> list;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list_view = findViewById(R.id.list_view);
        setListView(list_view);
    }

    private void setListView(ListView list_view) {
        list = new ArrayList<>();
        list.add(new MyModel("Item Name 1"));
        list.add(new MyModel("Item Name 2"));
        list.add(new MyModel("Item Name 3"));
        list.add(new MyModel("Item Name 4"));
        list.add(new MyModel("Item Name 5"));
        list.add(new MyModel("Item Name 6"));
        list.add(new MyModel("Item Name 7"));
        list.add(new MyModel("Item Name 8"));

adapter = new MyAdapter(this,list);
list_view.setAdapter(adapter);

    }
}
