package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Switch s_toast, s_snackbar, s_change, s_color, s_text_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s_toast = findViewById(R.id.switch_t);
        s_snackbar = findViewById(R.id.switch_s);
        s_change = findViewById(R.id.switch_ch);
        s_color = findViewById(R.id.switch_c);
        s_change.setText(R.string.s_text_off);

        s_toast.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "вы вызвали toast", Toast.LENGTH_LONG).show());

        s_snackbar.setOnClickListener(view -> Snackbar.make(view, "вы вызвали snackBar", Snackbar.LENGTH_LONG).show());



        s_change.setOnClickListener(view -> {
            if(s_change.isChecked()){
                s_change.setText(R.string.s_text_on);
            }
            else
                s_change.setText(R.string.s_text_off);

        });



        s_color.setOnClickListener(view -> {
            if(s_color.isChecked()){
                s_color.setTextColor(Color.BLUE);
            }
            else
                s_color.setTextColor(Color.BLACK);

        });











    }
}