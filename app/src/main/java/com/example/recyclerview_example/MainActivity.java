package com.example.recyclerview_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview_example.Adapters.PhoneAdapter;
import com.example.recyclerview_example.Models.PhoneModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<PhoneModel> list=new ArrayList<PhoneModel>();
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));
        list.add(new PhoneModel(R.drawable.phone,"Tony"));

        PhoneAdapter adapter=new PhoneAdapter(list,this);
        recyclerView.setAdapter(adapter);


        LinearLayoutManager linear=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

    }
}