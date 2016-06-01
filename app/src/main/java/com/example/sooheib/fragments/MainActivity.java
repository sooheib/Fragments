package com.example.sooheib.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       FragmentA fragmentA=new FragmentA();
      /*  FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.layoutMain,fragmentA,"MyFragment");
        fragmentTransaction.commit();*/
        //getFragmentManager().beginTransaction().add(R.id.layoutMain, fragmentA, "MyFragment").commit();

    }
}
