package com.example.chipgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class ActionChip extends AppCompatActivity {
    
    Chip chip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_chip);
        
        chip = findViewById(R.id.chip);
        
        chip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ActionChip.this, "Action Chip Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}
