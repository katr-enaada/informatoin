package com.example.information;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MoreFragment extends ListFragment  implements AdapterView.OnItemClickListener {


    // Array of strings storing country names
    String[] more = new String[] {
            "Sponsors",
            "Attendees",
            "Venue Map",
            "Documents"


    };

    // Array of integers points to images stored in /res/drawable/
    int[] flags = new int[]{
            R.drawable.ic_sponsors,
            R.drawable.ic_attendees,
            R.drawable.ic_map,
            R.drawable.ic_documents
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<4;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt",  more[i]);

            hm.put("flag", Integer.toString(flags[i]) );
            aList.add(hm);
        }

        // Keys used in Hashmapcountries
        String[] from = { "flag","txt" };

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.idmore};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.fragment_more, from, to);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView v=view.findViewById(R.id.idmore);
        Toast.makeText(getActivity(), "Item: " + v.getText()+" ", Toast.LENGTH_SHORT).show();
String s="";
        Intent in=new Intent();
switch (s){
    case  "Sponsors":
        in=new Intent(getActivity().getBaseContext(),Sponsoe.class);

        startActivity(in);
        break;
/*
*  "Sponsors",
            "Attendees",
            "Venue Map",
            "Documents"
* */
}
    }
}