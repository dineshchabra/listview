package com.example.dinesh.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<>();

        for(int i=1;i<=3;i++){
            list.add("Dinesh");
            list.add("Neeru");
            list.add("kovid");
        }

        SimpleArrayAdapter adapter = new SimpleArrayAdapter(list,this);
        ListView lview = (ListView) findViewById(R.id.view1);
        lview.setAdapter(adapter);
    }


}
