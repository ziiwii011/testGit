package com.example.silver_desk.interfactest;

import android.app.FragmentTransaction;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.silver_desk.interfactest.fragment.AjoutCalendrierFragment;

public class CalendrierActivity extends AppCompatActivity  {
    public static FragmentManager fragmentManager ;
    FloatingActionButton fab_add ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendrier);
        fragmentManager = getSupportFragmentManager();

        fab_add=(FloatingActionButton) findViewById(R.id.fab_add);


    }

public void fab_addOnclick(View view){

    Toast.makeText(CalendrierActivity.this,"home ",Toast.LENGTH_LONG).show();
    if(findViewById(R.id.conteneur_defragments)!=null) {

        android.support.v4.app.FragmentTransaction transaction= fragmentManager.beginTransaction();
        AjoutCalendrierFragment fragment = new AjoutCalendrierFragment();
        transaction.add(R.id.conteneur_defragments,fragment,null);
            transaction.commit();
    }

}

}

