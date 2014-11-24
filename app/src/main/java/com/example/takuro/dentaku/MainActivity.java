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
    private String operator = "null";
    private double first_num, second_num;
    private double answer = 0;
    private boolean first_flag = true, equal_flag = false ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button000 = (Button) findViewById(R.id.button000);
        Button buttonDot = (Button) findViewById(R.id.buttonDot);
        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonMult = (Button) findViewById(R.id.buttonMult);
        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        Button buttonEqual = (Button) findViewById(R.id.buttonEqual);


        resultText = (TextView) findViewById(R.id.editText);
        resultText.setFocusable(false);


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 0;
                prev_num = 0;
                first_num = 0;
                second_num = 0;
                operator = "null";
                resultText.setText(cutPoint(num));
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(0);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* prev_num /= 10;
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num;
                resultText.setText(cutPoint(num) + ".");
                prev_num *= 10;
                second_num = num;*/

            }
        });

        button000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal_flag == true) {
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                prev_num *= 100;
                num = prev_num;

                resultText.setText(cutPoint(num));
                prev_num *= 10;
                second_num = num;

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 buttonNumberFunc(1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonNumberFunc(9);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op_plus = "＋";
                buttonOperatorFunc(op_plus);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op_minus = "－";
                buttonOperatorFunc(op_minus);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op_mult = "×";
                buttonOperatorFunc(op_mult);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op_div = "÷";
                buttonOperatorFunc(op_div);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operator == "＋") {
                    answer = first_num + second_num;
                } else if (operator == "－") {
                    answer = first_num - second_num;
                } else if (operator == "×") {
                    answer = first_num * second_num;
                } else if (operator == "÷") {
                    answer = first_num / second_num;
                } else if (operator == "null") {
                    answer = num;
                }
                resultText.setText(cutPoint(answer));
                num = answer;
                first_num = num;
                equal_flag = true;

            }
        });

    }

    public void buttonNumberFunc(int n){
        if(equal_flag == true) {
            num = 0;
            prev_num = 0;
            first_num = 0;
            second_num = 0;
            operator = "null";
            equal_flag = false;
        }
        num = prev_num + n;
        prev_num += n;
        resultText.setText(cutPoint(num));
        prev_num *= 10;
        second_num = num;
    }

    public void buttonOperatorFunc(String n){
        if (operator != "null") {
            num = first_num;
        }
        resultText.setText(cutPoint(num) + n);
        operator = n;
        first_num = num;
        num = 0;
        prev_num = 0;
        first_flag = false;
        equal_flag = false;
    }

    public String cutPoint(double num){
        String dec_num = String.valueOf(num);
        if(num - (int)num == 0){
            dec_num = String.format("%.0f", num);
        }
        return dec_num;
    }


}
