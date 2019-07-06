package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.awt.font.NumericShaper;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

//    private Button showMoney;
//    private Button showTag;
//
    private TextView moneyText;

    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);

//        showMoney = findViewById(R.id.button_make_rain);
//        showTag = findViewById(R.id.button_show_tag);

    }

    public void makeItRain(View v) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));
    }

    public void showTag(View v) {
        Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG).show();
    }
}
