package com.example.myapplication;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewFragment extends RecyclerView.ViewHolder {
    private String title;

    public ViewFragment(@NonNull View itemView, String title) {
        super(itemView);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
}
