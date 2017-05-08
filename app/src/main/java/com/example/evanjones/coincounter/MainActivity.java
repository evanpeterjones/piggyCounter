package com.example.evanjones.coincounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double quarter = .25;
    double dime = .10;
    double nickel = .05;
    double penny = .01;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void addQuarter(View view) {
        total = total + quarter;
        add(total);
    }
    public void addDime(View view) {
        total = total + dime;
        add(total);
    }
    public void addNickel(View view) {
        total = total + nickel;
        add(total);
    }
    public void addPenny (View view) {
        total = total + penny;
        add(total);
    }
    public void reset (View view) {
        total = 0.00;
        add(total);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void add(double number) {
        number = number * 100;
        number = Math.round(number);
        number = number / 100;
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("$ " + number);
    }
}


















