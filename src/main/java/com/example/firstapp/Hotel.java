package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Hotel extends AppCompatActivity {
    double result;
    String spnChoice;
    int numOfQuarters;
    int numOfDimes;
    int numOfNickels;
    int numOfPennies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        final EditText Quarters = findViewById(R.id.editTextQuarters);
        final EditText Dimes = findViewById(R.id.editTextDimes);
        final EditText Nickels = findViewById(R.id.editTextNickels);
        final EditText Pennies = findViewById(R.id.editTextPennies);

        final TextView Result = findViewById(R.id.txtResult);
        final Spinner spn = findViewById(R.id.spn);
        Button findResult = findViewById(R.id.resultButton);

        findResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numOfQuarters = Integer.parseInt(Quarters.getText().toString());
                numOfDimes = Integer.parseInt(Dimes.getText().toString());
                numOfNickels = Integer.parseInt(Nickels.getText().toString());
                numOfPennies = Integer.parseInt(Pennies.getText().toString());

                spnChoice = spn.getSelectedItem().toString();
                result = (numOfQuarters * 0.25) + (numOfDimes * 0.1) + (numOfNickels * 0.05) + (numOfPennies * 0.01);
                Result.setText(spnChoice + "\n" + "Total Amount: $" + result);
            }
        });
    }
}