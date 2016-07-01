package com.example.m.pra6fragmentcommun;


import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class BlankFragment extends android.app.Fragment {
    zmianaKolorow zmiana;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        Button button =(Button)view.findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Uwaga","zmian23232a");
                     zmiana.zmianiaKolorowMetoda("ssij");
            }
        });


        return  view;

    }

    @Override
    public void onAttach(Context context) {
        Log.d("Uwaga","attachactivit232y");
        super.onAttach(context);

    }

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
           Log.d("Uwaga","attachactivity");
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            Log.d("Uwaga","attachactivit2y");
            zmiana=(zmianaKolorow)activity;
        }

    }



    public  interface zmianaKolorow
    {


            public void zmianiaKolorowMetoda(String kolory);


    }
}
