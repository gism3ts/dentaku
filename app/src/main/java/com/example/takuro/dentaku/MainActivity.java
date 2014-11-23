package com.example.takuro.dentaku;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView resultText;
    private double prev_num = 0;
    private double num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Button buttonC = (Button)findViewById(R.id.buttonC);
        Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button)findViewById(R.id.buttonMinus);



        resultText = (TextView)findViewById(R.id.editText);


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 0;
                prev_num = 0;
                resultText.setText(Double.toString(num));
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 1;
                prev_num += 1;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 2;
                prev_num += 2;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 3;
                prev_num += 3;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 4;
                prev_num += 4;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 5;
                prev_num += 5;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 6;
                prev_num += 6;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 7;
                prev_num += 7;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 8;
                prev_num += 8;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = prev_num + 9;
                prev_num += 9;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
            }
        });

        

    }






}
