package com.example.m.pra6fragmentcommun;

import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v4.app.FragmentHostCallback;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BlankFragment.zmianaKolorow {
    BlankFragment2 fragment2Rejestracja=  new BlankFragment2();
    BlankFragment fragment1Logowanie  = new BlankFragment();
    RelativeLayout rl ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Uwaga","zmian44a");
        rl = (RelativeLayout)findViewById(R.id.relative);








    }
    public void logowanie(View view) {
        android.app.FragmentManager manager = getFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        Log.d("Uwaga","zmianaaa");
        trans.replace(R.id.fragment,fragment1Logowanie);
        trans.commit();



    }

    public void rejestracja(View view) {
        android.app.FragmentManager manager = getFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        Log.d("Uwaga","zmian2a");
        trans.replace(R.id.fragment,fragment2Rejestracja);
        trans.commit();


    }


    public String siema(){

        return "siema";
    }

    @Override
    public void zmianiaKolorowMetoda(String kolory) {
        Log.d("Uwaga","zmiana");
        rl.setBackgroundColor(Color.BLUE);
    }
}
