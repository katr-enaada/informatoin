package com.example.information;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
//import android.support.v7.app.AlertController;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import android.widget.AdapterView.OnItemClickListener;
import android.content.Intent;


public class CalendarFragment extends Fragment {
   // private MediaPlayer player = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_calender,container,false);
        ArrayList<String> data =new ArrayList<>();
        data.add("aaaaaa");
        data.add("bbbbb");
        data.add("ccccc");
        data.add("ddddd");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.activity_list_item);
        ListView session=(ListView)v.findViewById(R.id.session);
        session.setAdapter(adapter);



      /*  ListView session=(ListView)v.findViewById(R.id.session);
        final Intent i = new Intent(getActivity().getApplicationContext(),MoreFragment.class);

       // String[] liste={"item1","item2","item3","item4","item5"};

       // ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.activity_list_item,liste);

       // session.setAdapter(adapter);
        String[] values = new String[] { "C 2 F", "F 2 C", "Currency"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.activity_list_item, R.id.session, values);

        session.setAdapter(arrayAdapter);

        session.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition     = position;

                if(itemPosition == 1)
                {
                    i.putExtra("identify", "c2f");
                    startActivityForResult(i, 1);
                    if(player != null)
                        player.stop();
                }
                else if(itemPosition == 2)
                {
                    i.putExtra("identify", "f2c");
                    startActivityForResult(i, 1);
                    if(player != null)
                        player.stop();
                }
                else if(itemPosition == 3)
                {
                    i.putExtra("identify", "currency");
                    startActivityForResult(i, 1);
                    if(player != null)
                        player.stop();
                }


            }

        });


*/
        return v;

    }



    /*private ListView mListView;
    private String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
            "Yann", "Zoé"
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_calender,container,false);
        mListView = (ListView)v. findViewById(R.id.listView);

        //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
        //Contenant une TextView avec comme identifiant "@android:id/text1"

        final ArrayAdapter<String> adapter;// =
               // new ArrayAdapter<String>(   getParentFragment(),
                //android.R.layout.simple_list_item_1,
              //  prenoms);
        //mListView.setAdapter(adapter);
        return  v;
    }*/
}
