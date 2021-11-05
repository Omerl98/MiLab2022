package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Activity3 extends AppCompatActivity {

    String[] lannister_names = {"Tywin Lannister", "Cersei Lannister", "Jaime Lannister", "Tyrion Lannister"};
    int[] lannister_images = {R.drawable.tywin_lannister, R.drawable.cersei_lannister, R.drawable.jaimer_lannister, R.drawable.tyrion_lannister};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.list2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(this,lannister_names, lannister_images));
    }
}