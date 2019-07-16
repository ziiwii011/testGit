package com.example.silver_desk.interfactest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.silver_desk.interfactest.fragment.AjoutCalendrierFragment;

public class CalendrierInterface extends AppCompatActivity {
public static android.support.v4.app.FragmentManager fragmentManager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendrier_interface);



    }
}
