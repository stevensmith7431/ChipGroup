package com.example.chipgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import com.google.android.material.chip.Chip;

import java.util.ArrayList;

public class FliterChip extends AppCompatActivity {

    private Chip trending,newarrival,bestselling;
    private Chip lowtohigh,hightolow;
    Button submit;
    private ArrayList<String> selectedchipdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fliter_chip);

        trending = findViewById(R.id.chip1);
        newarrival = findViewById(R.id.chip2);
        bestselling = findViewById(R.id.chip3);
        lowtohigh = findViewById(R.id.chip4);
        hightolow = findViewById(R.id.chip5);
        submit = findViewById(R.id.button);

        selectedchipdata = new ArrayList<>();

        CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if (isChecked){

                    selectedchipdata.add(compoundButton.getText().toString());

                } else {

                    selectedchipdata.remove(compoundButton.getText().toString());
                }

            }
        };

        trending.setOnCheckedChangeListener(checkedChangeListener);
        newarrival.setOnCheckedChangeListener(checkedChangeListener);
        bestselling.setOnCheckedChangeListener(checkedChangeListener);
        lowtohigh.setOnCheckedChangeListener(checkedChangeListener);
        hightolow.setOnCheckedChangeListener(checkedChangeListener);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("data",selectedchipdata.toString());
                setResult(101,intent);
                finish();
            }
        });

    }
}
