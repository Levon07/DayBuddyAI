package com.example.daybuddyai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    LinearLayout popup_menu;
    public boolean is_popped_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popup_menu = findViewById(R.id.PopUp_Menu_Layout);

    }

    public void ShowPopup(View view){
        if (!is_popped_up){
            popup_menu.setVisibility(View.VISIBLE);
            is_popped_up = true;
        }else {
            popup_menu.setVisibility(View.INVISIBLE);
            is_popped_up = false;
        }

    }

    public void main_layout_touch(View view){
        if (is_popped_up){
            popup_menu.setVisibility(View.INVISIBLE);
            is_popped_up = false;
        }
    }
}