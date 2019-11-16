package com.example.pr_rv_dimas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView sinopText;
    ImageView detailImage;
    Spinner spinner;
    private String[] namaHewan={"gajah","kucing","anjing"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailImage = (ImageView)findViewById(R.id.imageInfo);
        sinopText = (TextView)findViewById(R.id.sinopText);
        spinner =(Spinner)findViewById(R.id.spinner);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        int image = intent.getIntExtra("image",0);
        sinopText.setText(text);
        detailImage.setImageResource(image);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.support_simple_spinner_dropdown_item,namaHewan);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String hasil = adapter.getItem(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
