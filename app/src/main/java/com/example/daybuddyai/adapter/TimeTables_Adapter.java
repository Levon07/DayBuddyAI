package com.example.daybuddyai.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.daybuddyai.timetables_activity;

import java.util.ArrayList;
import java.util.List;

public abstract class TimeTables_Adapter extends RecyclerView.Adapter<TimeTables_Adapter.TimeTables_View_Holder>{

    private List<String> timetableList = new ArrayList<>();

    private String task;

    class TimeTables_View_Holder extends RecyclerView.ViewHolder{

        public TimeTables_View_Holder(View itemView) {
            super(itemView);
        }
    }
}
