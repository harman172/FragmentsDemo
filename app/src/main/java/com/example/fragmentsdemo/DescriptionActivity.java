package com.example.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);


        Intent intent = getIntent();
        int pos = intent.getExtras().getInt("position");

        DescriptionFragment descriptionFragment = (DescriptionFragment) getSupportFragmentManager().findFragmentById(R.id.description_frag);
        descriptionFragment.setPosition_id(pos);

    }
}
