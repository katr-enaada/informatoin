package com.example.information;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class InformationFragment extends Fragment {

   WebView wv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View v=

         inflater.inflate(R.layout.fragment_information,container,false);

       wv=v.findViewById(R.id.wv);
       String html="<body>"+
"<div><p>"+
"<h3 style=\"color:red\" >International Conference on Mechanical, "+
               "Manufacturing & Materials Engineering 2019  (IC3ME 2019)</h3></p><p> "+
	"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;is the premier forum for the presentation of new advances and research results in the fields of Mechanical,"
        +"Manufacturing & Materials Engineering. The conference which will be held at"
               +" the The University of M&#233;d&#233;a in the Urban Pole Campus of M&#233;d&#233;a City, Algeria."+
"M&#233;d&#233;a City is situated about 88 Km to the south of Algiers, the capital of Algeria on 06 - 07"+"" +
               " November 2019, will bring together leading researchers, engineers and scientists "+
               "in the domain of interest from all around the world.  IC3ME 2019 covers the entire "+
               "range of mechanical engineering, manufacturing processes, materials characterizations and designs."+
"We invite you to submit a research paper related to one of the themes of the conference.</p>"
+
"</div></body>"
               ;

       wv.loadData(html,"text/html",null);
        return  v;
    }
}
