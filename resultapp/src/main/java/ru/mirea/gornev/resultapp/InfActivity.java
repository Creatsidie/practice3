package ru.mirea.gornev.resultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InfActivity extends AppCompatActivity {
    EditText editTextTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf);
        editTextTitle = findViewById(R.id.edit_title);
    }

    public void sendResultOnMainActivityOnClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", editTextTitle.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}