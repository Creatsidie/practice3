package ru.mirea.gornev.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecivedTime extends AppCompatActivity {
    TextView textViewTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recived_time);
        textViewTime = findViewById(R.id.TextTime);
        Intent intent = getIntent();
        textViewTime.setText(intent.getStringExtra("time"));
    }
}