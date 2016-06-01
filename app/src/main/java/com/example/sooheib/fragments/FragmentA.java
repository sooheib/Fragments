package com.example.sooheib.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentA.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentA extends Fragment {
    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        Log.d("Fragment_App_Fragment","Fragment onAttach Called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment_App_Fragment", "Fragment onCreate Called");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("Fragment_App_Fragment", "Fragment onCreateView Called");
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        return v;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment_App_Fragment", "Fragment onActivityCreated Called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment_App_Fragment", "Fragment onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment_App_Fragment", "Fragment onResume Called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment_App_Fragment", "Fragment onPause Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment_App_Fragment", "Fragment onStop Called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment_App_Fragment", "Fragment onDestroyView Called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment_App_Fragment", "Fragment onDestroy Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment_App_Fragment", "Fragment onDetach Called");
    }
}
