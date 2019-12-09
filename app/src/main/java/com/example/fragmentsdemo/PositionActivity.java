package com.example.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PositionActivity extends AppCompatActivity implements ListClick{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDescription(View view){
        Intent intent = new Intent(this, DescriptionActivity.class);
        startActivity(intent);
    }

//    @Override
//    public void onClick(String title) {
//        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
//
//    }

    @Override
    public void onClick(int position) {
        Intent intent = new Intent(this, DescriptionActivity.class);
        intent.putExtra("position",position);
        startActivity(intent);
    }
}
