package com.example.tee.fef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleBirthright(View view) {
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        if(button1.getVisibility() == button1.GONE) {
            button1.setVisibility(button1.VISIBLE);
            button2.setVisibility(button2.VISIBLE);
            button3.setVisibility(button3.VISIBLE);
            button4.setVisibility(button4.VISIBLE);
            button5.setVisibility(button5.VISIBLE);
        } else{
            button1.setVisibility(button1.GONE);
            button2.setVisibility(button2.GONE);
            button3.setVisibility(button3.GONE);
            button4.setVisibility(button4.GONE);
            button5.setVisibility(button5.GONE);
        }
    }

    public void toggleConquest(View view) {
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        if(button6.getVisibility() == button6.GONE) {
            button6.setVisibility(button6.VISIBLE);
            button7.setVisibility(button7.VISIBLE);
            button8.setVisibility(button8.VISIBLE);
            button9.setVisibility(button9.VISIBLE);
            button10.setVisibility(button10.VISIBLE);
        } else{
            button6.setVisibility(button6.GONE);
            button7.setVisibility(button7.GONE);
            button8.setVisibility(button8.GONE);
            button9.setVisibility(button9.GONE);
            button10.setVisibility(button10.GONE);
        }
    }

    public void toggleRevalation(View view) {
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);
        Button button15 = (Button) findViewById(R.id.button15);
        if(button11.getVisibility() == button11.GONE) {
            button11.setVisibility(button11.VISIBLE);
            button12.setVisibility(button12.VISIBLE);
            button13.setVisibility(button13.VISIBLE);
            button14.setVisibility(button14.VISIBLE);
            button15.setVisibility(button15.VISIBLE);
        } else{
            button11.setVisibility(button11.GONE);
            button12.setVisibility(button12.GONE);
            button13.setVisibility(button13.GONE);
            button14.setVisibility(button14.GONE);
            button15.setVisibility(button15.GONE);
        }
    }

}
