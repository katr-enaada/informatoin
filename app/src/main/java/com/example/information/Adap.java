package com.example.information;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adap extends ArrayAdapter<Session> {

    //tweets est la liste des models à afficher
    public Adap(Context context, List<Session> tweets) {
        super(context, 0, tweets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
       //     convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_tweet,parent, false);
        }

        TweetViewHolder viewHolder = (TweetViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new TweetViewHolder();
         //   viewHolder.pseudo = (TextView) convertView.findViewById(R.id.pseudo);
            viewHolder.text = (TextView) convertView.findViewById(R.id.text);
         //   viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Session tweet = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.pseudo.setText(tweet.nom);
        viewHolder.text.setText(tweet.duree);
        viewHolder.avatar.setImageDrawable(new ColorDrawable());

        return convertView;
    }

    private class TweetViewHolder{
        public TextView pseudo;
        public TextView text;
        public ImageView avatar;
    }
}