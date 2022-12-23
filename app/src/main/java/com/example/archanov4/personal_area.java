package com.example.archanov4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;


public class personal_area extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);

    }

    public void GoToLogin (View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void GoToStatistic (View v){
        Intent intent = new Intent(this,statistic_area.class);
        startActivity(intent);
    }
    public void GoToMap (View v){
        Intent intent = new Intent();
        intent.setAction(intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:55.754283,37.62002"));
        startActivity(intent);
    }
}
