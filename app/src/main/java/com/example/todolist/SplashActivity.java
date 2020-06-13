package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to ToDoList app", Toast.LENGTH_LONG).show();
        finish();
    }
}
