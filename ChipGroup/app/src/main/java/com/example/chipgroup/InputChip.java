package com.example.chipgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;

public class InputChip extends AppCompatActivity {

    EditText input;
    Button addchip;
    ChipGroup chipGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_chip);

        input = findViewById(R.id.editText);
        addchip = findViewById(R.id.button);
        chipGroup = findViewById(R.id.inputchip);

    }

    public void btn_click(View view){

        final Chip chip = new Chip(this);

        ChipDrawable chipDrawable = ChipDrawable.createFromAttributes(this,null,
                0,R.style.Widget_MaterialComponents_Chip_Entry);

        chip.setChipDrawable(chipDrawable);

        chip.setCheckable(false);
        chip.setClickable(false);
        chip.setChipIconResource(R.drawable.ic_location_on_black_24dp);
        chip.setIconStartPadding(3f);
        chip.setPadding(60,10,60,10);
        chip.setText(input.getText().toString());
        chip.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chipGroup.removeView(chip);

            }
        });

        chipGroup.addView(chip);
        input.setText("");

    }
}
