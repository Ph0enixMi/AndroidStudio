package com.mirea.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        View.OnClickListener oclbtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickNewActivity();
            }
        };
        button.setOnClickListener(oclbtnOk);
    }

    public void onClickNewActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "MIREA - Кожевников Миаил Сергеевич");
        startActivity(intent);
        setContentView(R.layout.activity_second);
    }
}