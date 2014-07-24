package com.plab.timetracker;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;

import java.util.List;

/**
 * Created by Plab on 2014/07/25.
 */
public class MainActivity extends Activity {

     public void onCreate(Bundle saveInstanceState){
         super.onCreate(saveInstanceState);
         setContentView(R.layout.mainlayout);

         FragmentManager manager = getFragmentManager();
         HelloFragment helloFragment = new HelloFragment();


         FragmentTransaction transaction = manager.beginTransaction();
         transaction.add(R.id.root, helloFragment);
         transaction.commit();


     }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            DialogHelloFragment dialogHelloFragment = new DialogHelloFragment();

            FragmentManager manager = getFragmentManager();

            dialogHelloFragment.show(manager, "dialog");
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.root, dialogHelloFragment);
//        transaction.commit();
            return false;
        }

       return super.onTouchEvent(event);
    }
}
