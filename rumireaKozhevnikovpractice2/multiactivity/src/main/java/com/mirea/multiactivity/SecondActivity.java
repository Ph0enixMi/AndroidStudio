package com.mirea.multiactivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.mirea.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondBinding binding;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView3 = (TextView) findViewById(R.id.textView3);
        String text = (String) getIntent().getSerializableExtra("key");
        textView3.setText(text);
    }
}
