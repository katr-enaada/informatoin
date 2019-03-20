package com.example.information;

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

public class SpeakerFragment extends ListFragment  implements AdapterView.OnItemClickListener {


    // Array of strings storing country names
    String[] countries = new String[] {
            "India",
            "Pakistan",
            "Sri Lanka",
            "China",
            "Bangladesh",
            "Nepal",
            "Afghanistan",
            "North Korea",
            "South Korea",
            "Japan"
    };

    // Array of integers points to images stored in /res/drawable/
    int[] flags = new int[]{
            R.drawable.india,
            R.drawable.pakistan,
            R.drawable.srilanka,
            R.drawable.china,
            R.drawable.bangladesh,
            R.drawable.nepal,
            R.drawable.afghanistan,
            R.drawable.nkorea,
            R.drawable.skorea,
            R.drawable.japan
    };

    // Array of strings to store currencies
    String[] currency = new String[]{
            "Indian Rupee",
            "Pakistani Rupee",
            "Sri Lankan Rupee",
            "Renminbi",
            "Bangladeshi Taka",
            "Nepalese Rupee",
            "Afghani",
            "North Korean Won",
            "South Korean Won",
            "Japanese Yen"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

       // List<Session>l=new ArrayList<>();
     /*   for(int i=0;i<10;i++){
            Session s=new Session(i,"nom"+i,new Date(),i*33,"ALI"+i);
            l.add(s);
            HashMap<String, String> hm = new HashMap<String,String>();

            hm.put("txt", "Country : " + countries[i]);
            hm.put("cur","Currency : " + currency[i]);
            hm.put("flag", Integer.toString(flags[i]) );
            aList.add(hm);
        }*/
        List<HashMap<String,Object>> aList2 = new ArrayList<>();

        for(int i=0;i<100;i++){
            int rand=(int)(Math.random()*flags.length);
            Session s=new Session(i,"nom"+i,new Date(),90,flags[rand]);

            HashMap<String, Object> hm = new HashMap<>();
            hm.put("id",  s.id);
            hm.put("nom", s.nom);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            hm.put("date",simpleDateFormat.format( s.date ));
            hm.put("duree",s.duree );
            hm.put("annimateur", s.annim );
            aList2.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","id","nom","date","duree","annimateur" };

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.id,R.id.nom,R.id.date,R.id.duree,R.id.flag};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList2, R.layout.fragment_speaker, from, to);

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
        TextView v=view.findViewById(R.id.annimateur);
        Toast.makeText(getActivity(), "Item: " + v.getText()+" ", Toast.LENGTH_SHORT).show();

    }
}