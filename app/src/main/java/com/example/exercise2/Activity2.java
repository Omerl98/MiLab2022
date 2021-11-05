package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    String[] stark_names = {"Ned Stark", "Catelyn Stark", "Robb Stark", "Sansa Stark", "Arya Stark", "Bran Stark", "Rickon Stark", "Jon Snow"};
    int[] stark_images = {R.drawable.ned_stark, R.drawable.arya_stark, R.drawable.robb_stark, R.drawable.sansa_stark, R.drawable.arya_stark, R.drawable.bran_stark,
            R.drawable.rickon_stark, R.drawable.jon_snow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.list1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(this,stark_names, stark_images));
    }
}