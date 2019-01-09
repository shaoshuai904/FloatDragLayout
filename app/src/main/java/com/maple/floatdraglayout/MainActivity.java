package com.maple.floatdraglayout;

import android.graphics.RectF;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.maple.floatdraglayout.view.FloatDragLayout;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    FloatDragLayout fdl_view;

    Switch sw_drag;
    Switch sw_near_screen_edge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        fdl_view = findViewById(R.id.fdl_view);
        sw_drag = findViewById(R.id.sw_drag);
        sw_near_screen_edge = findViewById(R.id.sw_near_screen_edge);


        fdl_view.setPaddingRect(new RectF(10, 10, 10, 10))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                });
        sw_drag.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                fdl_view.setDrag(isChecked);
            }
        });
        sw_near_screen_edge.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                fdl_view.setNearScreenEdge(isChecked);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });

        // default setting
        sw_drag.setChecked(true);
        sw_near_screen_edge.setChecked(false);
    }
}
