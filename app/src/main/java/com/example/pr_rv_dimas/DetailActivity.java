package com.example.pr_rv_dimas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView sinopText;
    ImageView detailImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailImage = (ImageView)findViewById(R.id.imageInfo);
        sinopText = (TextView)findViewById(R.id.sinopText);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        int image = intent.getIntExtra("image",0);
        sinopText.setText(text);
        detailImage.setImageResource(image);
    }
}
