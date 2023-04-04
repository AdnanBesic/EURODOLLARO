package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double cambio = 1.1177;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void USDtoEuro(View v)
    {
        EditText euro = (EditText)findViewById(R.id.txt_euro);
        EditText dollaro = (EditText)findViewById(R.id.txt_usd);
         Double dol = Double.parseDouble(dollaro.getText().toString());
         Double eur = dol/cambio;
         euro.setText(String.valueOf(eur));
         dollaro.setText(String.valueOf(dol));
    }



}