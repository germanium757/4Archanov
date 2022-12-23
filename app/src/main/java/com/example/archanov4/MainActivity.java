package com.example.archanov4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GoToPersonal (View v){
        Intent intent = new Intent(this,personal_area.class);
        startActivity(intent);

    }
    public void GoToRegistrate (View v){
        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS clients (id INTEGER PRIMARY KEY AUTOINCREMENT, nameUser TEXT, password TEXT)");
        EditText editTextt = findViewById(R.id.loginField);
        String nameUser = editTextt.getText().toString();
        editTextt = findViewById(R.id.passwordField);
        String password = editTextt.getText().toString();
        String exception = String.format("INSERT INTO clients(nameUser, password) VALUES ('%s', '%s1')",nameUser,password);
        db.execSQL(exception);
        db.close();

    }

}