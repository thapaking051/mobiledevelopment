package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double conversion = 2.2;
    double weight;
    double convertedweight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText userweight = findViewById(R.id.userWeight);
        final RadioButton PtoK = findViewById(R.id.rdpPtoK);
        final RadioButton KtoP = findViewById(R.id.rdpKtoP);
        final TextView results = findViewById(R.id.txtResult);
        final Button convertButton = findViewById(R.id.button);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight = Double.parseDouble(userweight.getText().toString());
                if (weight < 500) {
                    if (PtoK.isChecked()) {
                        convertedweight = weight / conversion;
                        results.setText(convertedweight + "");
                    } else if (KtoP.isChecked()) {
                        convertedweight = weight * conversion;
                        results.setText(convertedweight + "");
                    } else {}
                }
                else{
                    Toast.makeText(MainActivity.this, "Weight needs to be less than 500", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}