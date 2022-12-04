package com.example.bloodworkeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    private final TextView sodiumOut = (TextView) findViewById(R.id.textView15);
    private final TextView potassiumOut = (TextView) findViewById(R.id.textView16);
    private final TextView chlorideOut = (TextView) findViewById(R.id.textView17);
    private final TextView calciumOut = (TextView) findViewById(R.id.textView18);
    private final TextView magnesiumOut = (TextView) findViewById(R.id.textView19);
    private final TextView zincOut = (TextView) findViewById(R.id.textView20);
    private final TextView d5Out = (TextView) findViewById(R.id.textView21);
    private final TextView ironOut = (TextView) findViewById(R.id.textView22);
    private final TextView b12Out = (TextView) findViewById(R.id.textView23);
    private final TextView aOut = (TextView) findViewById(R.id.textView24);
    private final TextView testosteroneOut = (TextView) findViewById(R.id.textView25);
    private final TextView cholestoralOut = (TextView) findViewById(R.id.textView27);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        sodiumOut.setText(MainActivity.sodiumMessage(MainActivity.getSodium()));
        potassiumOut.setText(MainActivity.potassiumMessage(MainActivity.getPotassium()));
        chlorideOut.setText(MainActivity.chlorideMessage(MainActivity.getChloride()));
        calciumOut.setText(MainActivity.calciumMessage(MainActivity.getCalcium()));
        magnesiumOut.setText(MainActivity.magnesiumMessage(MainActivity.getMagensium()));
        zincOut.setText(MainActivity.zincMessage(MainActivity.getZinc()));
        d5Out.setText(MainActivity.d5Message(MainActivity.getD5()));
        ironOut.setText(MainActivity.ironMessage(MainActivity.getIron()));
        b12Out.setText(MainActivity.b12Message(MainActivity.getB12()));
        aOut.setText(MainActivity.aMessage(MainActivity.getVitaminA()));
        testosteroneOut.setText(MainActivity.testosteroneMessage(MainActivity.getTestosterone()));
        cholestoralOut.setText(MainActivity.cholestralMessage(MainActivity.getCholestoral()));

    }

    }
