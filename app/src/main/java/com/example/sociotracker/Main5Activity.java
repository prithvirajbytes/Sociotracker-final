package com.example.sociotracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    private Button standard;
    private Button premium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        standard = (Button) findViewById(R.id.standard_button);
        standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

        premium=(Button)findViewById(R.id.premium_button);
        premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });
    }

    public void openActivity6() {
        Intent intent1 = new Intent(this, Main6Activity.class);
        startActivity(intent1);
    }

    public void openActivity7() {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

}
