package ru.mirea.kozhevnikov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    public TextView  textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String date = intent.getStringExtra("date");
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(date);
    }
}