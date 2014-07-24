package com.plab.timetracker;

import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Satoru on 2014/07/25.
 */
public class DialogHelloFragment extends DialogFragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle saveInstanceState){
        View dialog = inflater.inflate(R.layout.flagmentmain,container,false);
//        dialog.setBackgroundColor(Color.GRAY);
        TextView textView = (TextView)dialog.findViewById(R.id.hello);
        textView.setPadding(10,10,10,10);
        textView.setBackgroundColor(Color.GRAY);
        textView.setTextColor(Color.WHITE);


        return dialog;
    }
}
