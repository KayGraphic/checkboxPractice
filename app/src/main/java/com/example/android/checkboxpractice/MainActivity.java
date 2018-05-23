package com.example.android.checkboxpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int age = 10;
    String kindaOld = "kinda";



    public void plus(View view) {
        age = age + 1;
        displayAge(age);
        displayDogAge(age * 7);
    }

    public void minus(View view) {
        age = age - 1;
        displayAge(age);
        displayDogAge(age * 7);
    }



    public void displayAge(int refname) {
        TextView regage = (TextView) findViewById(R.id.current_age);
        regage.setText(String.valueOf(refname));


    }


    private void displayDogAge(int refname1) {
        TextView dogage = (TextView) findViewById(R.id.textView_dogage);
        dogage.setText(String.valueOf(refname1));

    }

    public void displayAgeMessage(String kindaOld) {
        TextView regage = (TextView) findViewById(R.id.textView_ageMessage);
        regage.setText(String.valueOf(kindaOld));


    }


        public void calc (View view){

            CheckBox smallIsChecked = (CheckBox) findViewById(R.id.small_dog_checkBox);
            boolean smalldog1 = smallIsChecked.isChecked();

            CheckBox bigIsChecked = (CheckBox) findViewById(R.id.big_dog_checkBox);
            boolean bigdog1 = bigIsChecked.isChecked();


            if (smalldog1) {
                kindaOld="not so Old";
                age = age + 200;
                displayDogAge(age);
                displayAgeMessage(kindaOld);
                ImageView noswitch = (ImageView)findViewById(R.id.no);
                    noswitch.setImageResource(R.drawable.yes);
                }


            if (bigdog1) {
                kindaOld="Super Duper";
                age = age + 5000;
                displayDogAge(age);
                displayAgeMessage(kindaOld);
                ImageView noswitch = (ImageView)findViewById(R.id.no);
                    noswitch.setImageResource(R.drawable.maybe);
                }

            }

    public void reset(View view){
        age = 0;
        displayAge(age);
        displayDogAge(age * 7);
        CheckBox checkBox = (CheckBox) findViewById(R.id.small_dog_checkBox);
        checkBox.setChecked(false);

    CheckBox checkBox1 = (CheckBox) findViewById(R.id.big_dog_checkBox);
        checkBox1.setChecked(false);
        ImageView noswitch1 = (ImageView)findViewById(R.id.no);
        noswitch1.setImageResource(R.drawable.no);
}
}






