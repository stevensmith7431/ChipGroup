package com.example.chipgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button inputchip,filterchip,choicechip,actionchip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputchip = findViewById(R.id.button1);
        filterchip = findViewById(R.id.button2);
        choicechip = findViewById(R.id.button3);
        actionchip = findViewById(R.id.button4);

        inputchip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MainActivity.this,InputChip.class);
                startActivity(intent1);
            }
        });

        filterchip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity.this,FloatingActionBarFilterChip.class);
                startActivity(intent2);
            }
        });

        choicechip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(MainActivity.this,ChoiceChip.class);
                startActivity(intent3);

            }
        });

        actionchip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = new Intent(MainActivity.this,ActionChip.class);
                startActivity(intent4);

            }
        });
    }
}
