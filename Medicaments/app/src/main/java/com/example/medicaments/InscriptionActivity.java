package com.example.medicaments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }
    public void login(View view){
        startActivities(new Intent[]{new Intent(InscriptionActivity.this, MainActivity.class)});
    }
}