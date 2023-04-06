package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment1 extends androidx.fragment.app.Fragment implements RecyclerViewAdapter.ItemClickListener {
    private ArrayList<ViewFragment> list = new ArrayList<>();
    String y;
    String r;
    String u;
    Fragment1(String y, String r, String u){
        this.y=y;
        this.r=r;
        this.u=u;
    }

        final String LOG_TAG = "myLogs";

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            Log.d(LOG_TAG, "Fragment1 onAttach");
        }

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d(LOG_TAG, "Fragment1 onCreate");
        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_1, null);
            buildListData();
            TextView tv = (TextView) view.findViewById(R.id.описание1);
            tv.setText(y);
            TextView tv1 = (TextView) view.findViewById(R.id.описание1_1);
            tv1.setText(r);
            TextView tv2 = (TextView) view.findViewById(R.id.описание1_1_1);
            tv2.setText(u);
            Log.d(LOG_TAG, "Fragment1 onCreateView");
            return view;

        }
        private void initRecyclerView(View view){
            RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

            recyclerView.setLayoutManager(layoutManager);
            RecyclerViewAdapter adapter= new RecyclerViewAdapter(list, this.);
            recyclerView.setAdapter(adapter);
        }
        private void buildListData(){
            list.add(new ViewFragment("@string/name1"));
            list.add(new ViewFragment("@string/name2"));
            list.add(new ViewFragment("@string/name3"));
            list.add(new ViewFragment("@string/name4"));
        }

        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            Log.d(LOG_TAG, "Fragment1 onActivityCreated");
        }

        public void onStart() {
            super.onStart();
            Log.d(LOG_TAG, "Fragment1 onStart");
        }

        public void onResume() {
            super.onResume();
            Log.d(LOG_TAG, "Fragment1 onResume");
        }

        public void onPause() {
            super.onPause();
            Log.d(LOG_TAG, "Fragment1 onPause");
        }

        public void onStop() {
            super.onStop();
            Log.d(LOG_TAG, "Fragment1 onStop");
        }

        public void onDestroyView() {
            super.onDestroyView();
            Log.d(LOG_TAG, "Fragment1 onDestroyView");
        }

        public void onDestroy() {
            super.onDestroy();
            Log.d(LOG_TAG, "Fragment1 onDestroy");
        }

        public void onDetach() {
            super.onDetach();
            Log.d(LOG_TAG, "Fragment1 onDetach");
        }

    @Override
    public void onItemClick(ViewFragment viewFragment) {
            Fragment fragment = DetailFragment.newInstance();
    }
}
