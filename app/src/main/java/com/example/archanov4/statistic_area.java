package com.example.archanov4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class statistic_area extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistic_area);
    }
    public void GoToPersonal (View v){
        Intent intent = new Intent(this,personal_area.class);
        startActivity(intent);
    }


}
