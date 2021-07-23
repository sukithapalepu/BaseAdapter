package com.example.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<MyModel> list;

    public MyAdapter(Context context, ArrayList<MyModel> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        }

        setUpData(view,position);
        return view;
    }

    private void setUpData(View view, final int position) {
        LinearLayout linear_layout_id = view.findViewById(R.id.linear_layout_id);
        TextView textView = (TextView) view.findViewById(R.id.item_name_tv);
        textView.setText(list.get(position).getTitle());
        linear_layout_id.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Position: " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    }

