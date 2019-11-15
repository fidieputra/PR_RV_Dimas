package com.example.pr_rv_dimas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements GridAdapter.ItemClickListener{

    private RecyclerView recyclerView;
    private GridAdapter adapter;
    private ArrayList<String> judul;
    private ArrayList<String> sinop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        String[] data1 = {getString(R.string.judul1), getString(R.string.judul2), getString(R.string.judul3),
                getString(R.string.judul4), getString(R.string.judul5), getString(R.string.judul6)};
        String[] data2 = {getString(R.string.sinop1), getString(R.string.sinop2), getString(R.string.sinop3),
                getString(R.string.sinop4), getString(R.string.sinop5), getString(R.string.sinop6)};
        addJudul(Arrays.asList(data1));
        addSinop(Arrays.asList(data2));
        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        int numberOfColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        adapter = new GridAdapter(this, data1);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    void addJudul(List data){
        judul = new ArrayList<>();
        judul.addAll(data);
    }
    void addSinop(List data){
        sinop = new ArrayList<>();
        sinop.addAll(data);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, judul.get(position), Toast.LENGTH_SHORT).show();
        Log.i("TAG", "You clicked number " + adapter.getItem(position)
                + ", which is at cell position " + position);
        Intent pindah = new Intent(MainActivity.this,DetailActivity.class);
        pindah.putExtra("image",R.mipmap.logo1_foreground+(position*3));
        pindah.putExtra("text",sinop.get(position));
        startActivity(pindah);
    }
}