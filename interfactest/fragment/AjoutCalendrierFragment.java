package com.example.silver_desk.interfactest.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silver_desk.interfactest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AjoutCalendrierFragment extends Fragment {


    public AjoutCalendrierFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=   inflater.inflate(R.layout.fragment_ajout_calendrier, container, false);



    return  view ;

    }



}
