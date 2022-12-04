package com.example.bloodworkeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static Double sodium;
    static Double potassium;
    static Double chloride;
    static Double calcium;
    static Double magnesium;
    static Double zinc;
    static Double d5;
    static Double iron;
    static Double b12;
    static Double vitaminA;
    static Double testosterone;
    static Double cholesterol;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.editTextTextPersonName) == null) {
            sodium = 0.0;
        } else {
            sodium = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName2) == null) {
            potassium = 0.0;
        } else {
            potassium = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName2)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName3) == null){
            chloride = 0.0;
        } else{
            chloride = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName3)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName4) == null) {
            calcium = 0.0;
        } else{
            calcium = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName4)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName5) == null) {
            magnesium = 0.0;
        } else {
            magnesium = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName5)).getText().toString());

        }

        if(findViewById(R.id.editTextTextPersonName6) == null) {
            zinc = 0.0;
        } else {
            zinc = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName6)).getText().toString());

        }

        if(findViewById(R.id.editTextTextPersonName7) == null) {
            d5 = 0.0;
        }else {
            d5 = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName7)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName8) == null) {
            iron = 0.0;
        }else {
            iron = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName8)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName9) == null) {
            b12 = 0.0;
        }else {
            b12 = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName9)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName10) == null) {
            vitaminA = 0.0;
        }else {
            vitaminA = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName10)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName11) == null) {
            testosterone = 0.0;
        }else {
            testosterone = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName11)).getText().toString());
        }

        if(findViewById(R.id.editTextTextPersonName12) == null) {
            cholesterol = 0.0;
        }else {
            cholesterol = Double.parseDouble(((EditText)findViewById(R.id.editTextTextPersonName12)).getText().toString());
        }

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Activity2.class));
            }
        });

    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public static String sodiumMessage(double sodium) {
        if(sodium >= 134 && sodium <= 144) {
            return "";
        }
        else if (sodium < 134)
        return "You are below the range for sodium!";
        else return "You are above the range for sodium!";
    }

    public static String potassiumMessage(double potassium){
        if(potassium>= 3.5 && potassium <= 5.2)
        {
            return ("");
        }
        else if(potassium < 3.5)
        {
            return ("You are below the range for pottasium!");
        }
        else
        {
             return ("You are above the range for pottasium!");
        }

    }

    public static String chlorideMessage(double chloride){
        if(chloride >= 96 && chloride <= 106)
        {
            return ("");
        }
        else if(chloride < 96)
        {
            return ("You are below the range for chloride!");
        }
        else
        {
            return ("You are above the range for chloride!");
        }
    }

    public static String calciumMessage(double calcium){
        if(calcium >= 8.7 && calcium <= 10.2)
        {
            return ("");
        }
        else if(calcium < 8.7)
        {
            return ("You are below the range for calcium!");
        }
        else
        {
            return ("You are above the range for calcium!");
        }
    }

    public static String magnesiumMessage(double magnesium){
        if(magnesium >= 4.2  && magnesium<= 6.8)
        {
           return ("");
        }
        else if(magnesium < 4.2)
        {
            return ("You are below the range for magnesium!");
        }
        else
        {
            return ("You are above the range for magnesium!");
        }
    }

    public static String zincMessage(double zinc) {
        if(zinc >= 80  && zinc<= 120)
        {
            return ("");
        }
        else if(zinc < 80)
        {
            return ("You are below the range for zinc!");
        }
        else
        {
            return ("You are above the range for zinc!");
        }
    }

    public static String d5Message(double d5) {
        if(d5 >= 20  && d5<= 40)
        {
            return ("");
        }
        else if(d5 < 20)
        {
            return ("You are below the range for D, 25-hydroxy!");
        }
        else
        {
            return ("You are above the range for D, 25-hydroxy!");
        }
    }

    public static String ironMessage(double iron) {
        if(iron >= 60  && iron<= 170)
        {
            return ("");
        }
        else if(iron < 60)
        {
            return ("You are below the range for Iron!");
        }
        else
        {
            return ("You are above the range for Iron!");
        }
    }

    public static String b12Message(double b12) {
        if(b12 >= 5  && b12<= 50)
        {
            return ("");
        }
        else if(b12 < 5)
        {
            return ("You are below the range for Vitamin B12!");
        }
        else
        {
            return ("You are above the range for Vitamin B12!");
        }
    }

    public static String aMessage(double vitaminA) {
        if(vitaminA >= 20  && vitaminA<= 60)
        {
            return ("");
        }
        else if(vitaminA < 50)
        {
            return ("You are below the range for Vitamin A!");
        }
        else
        {
            return ("You are above the range for Vitamin A!");
        }
    }

    public static String testosteroneMessage(double testosterone) {
        if(testosterone >= 20  && testosterone<= 60)
        {
            return ("");
        }
        else if(testosterone < 50)
        {
            return ("You are below the range for Testosterone!");
        }
        else
        {
            return ("You are above the range for Testosterone!");
        }
    }

    public static String cholestralMessage(double cholesterol) {
        if(cholesterol >= 20  && cholesterol<= 60)
        {
            return ("");
        }
        else if(cholesterol < 50)
        {
            return ("You are below the range for Testosterone!");
        }
        else
        {
            return ("You are above the range for Testosterone!");
        }
    }

    public static double getSodium() {
        return sodium;
    }

    public static double getPotassium() {
        return potassium;
    }

    public static double getChloride() {
        return chloride;
    }

    public static double getCalcium() {
        return calcium;
    }

    public static double getMagensium() {
        return magnesium;
    }

    public static double getZinc() {
        return magnesium;
    }

    public static double getD5() {
        return d5;
    }

    public static double getIron() {
        return iron;
    }

    public static double getB12() {
        return b12;
    }

    public static double getVitaminA() {
        return vitaminA;
    }

    public static double getTestosterone() {
        return testosterone;
    }

    public static double getCholestoral() {
        return cholesterol;
    }







}