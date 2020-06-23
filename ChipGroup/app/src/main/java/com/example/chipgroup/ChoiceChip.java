package com.example.chipgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;

public class ChoiceChip extends AppCompatActivity {

    private ChipGroup chipGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_chip);

        chipGroup = findViewById(R.id.chipgroup2);

        for (int i = 1; i < 15 ; i++){

            Chip chip = new Chip(this);

            ChipDrawable chipDrawable = ChipDrawable.createFromAttributes(this,null,0,
                    R.style.Widget_MaterialComponents_Chip_Choice);

            chip.setChipDrawable(chipDrawable);

            chip.setPadding(10,10,10,10);
            chip.setText("Option :" +i);

            chipGroup.addView(chip);
        }
    }
}
