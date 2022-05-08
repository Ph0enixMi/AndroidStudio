package com.mirea.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);

        Intent shareIntent = new Intent(Intent.ACTION_SEND);

        button = (Button) findViewById(R.id.button);
        View.OnClickListener oclbtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (openLinkIntent.resolveActivity((getPackageManager())) != null){
                    startActivity(openLinkIntent);
                } else{
                    Log.d("Inten", "Не получается обработать намерение!");
                }
            }
        };
        button.setOnClickListener(oclbtnOk);

        button2 = (Button) findViewById(R.id.button2);
        View.OnClickListener oclbtnO = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Кожевников Михаил Сергеевич");
                startActivity(Intent.createChooser(shareIntent, "Кожевников Михаил Сергеевич"));
            }
        };
        button2.setOnClickListener(oclbtnO);

    }
}