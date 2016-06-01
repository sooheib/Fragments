package com.example.sooheib.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Fragment_App_Activity", "Activity onCreate Called");


        FragmentA fragmentA = new FragmentA();
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.layoutMain, fragmentA, "MyFragment");
//        fragmentTransaction.commit();

//        getFragmentManager().beginTransaction().add(R.id.layoutMain, fragmentA, "MyFragment").commit();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Fragment_App_Activity", "Activity onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Fragment_App_Activity", "Activity onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Fragment_App_Activity", "Activity onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Fragment_App_Activity", "Activity onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Fragment_App_Activity", "Activity onDestroy Called");
    }

}
