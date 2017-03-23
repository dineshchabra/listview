package com.example.dinesh.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;



/**
 * Created by dinesh on 19/3/17.
 */

public class SimpleArrayAdapter extends BaseAdapter implements ListAdapter {

    private ArrayList<String> list = new ArrayList<>();
    private Context context;



    public SimpleArrayAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
        //just return 0 if your list items do not have an Id variable.
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.rowlayout, null);
        }

        //Handle TextView and display string from your list
        TextView listItemText = (TextView)view.findViewById(R.id.text1);
        listItemText.setText(list.get(position));

        TextView listItemText1 = (TextView)view.findViewById(R.id.text2);
        listItemText1.setText("Item No : " + list.get(position));
        //Handle buttons and add onClickListeners
        Button button1 = (Button)view.findViewById(R.id.butt1);
        Button button2 = (Button)view.findViewById(R.id.butt2);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String item =  list.get(position);
                Toast.makeText(context,item + " Pressed",Toast.LENGTH_SHORT).show();

                }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //do something
                String item =  list.get(position);
                Toast.makeText(context,item + " Pressed",Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}