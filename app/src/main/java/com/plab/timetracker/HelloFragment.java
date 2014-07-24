package com.plab.timetracker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Satoru on 2014/07/25.
 */
public class HelloFragment extends BaseFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle saveInstanceState){
        return inflater.inflate(R.layout.flagmentmain,container,false);
    }
}
