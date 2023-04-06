package com.example.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

public class DetailFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    public DetailFragment(){
    }


    public static DetailFragment newInstance(String param1, String param2){
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (getArguments() !=null){
            mParam1=getArguments().getString(ARG_PARAM1);
        }

    }

    @Override
    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_1, container, false);
       TextView описание1 = view.findViewById(R.id.описание1);
        описание1.setText(mParam1);
        return view;
    }
}
