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
    private String operator;
    private double first_num, second_num;
    private double answer = 0;
    private boolean first_flag = true, equal_flag = false ;
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
        Button button000 = (Button)findViewById(R.id.button000);
        Button buttonDot = (Button)findViewById(R.id.buttonDot);
        Button buttonC = (Button)findViewById(R.id.buttonC);
        Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button)findViewById(R.id.buttonMinus);
        Button buttonMult = (Button)findViewById(R.id.buttonMult);
        Button buttonDiv = (Button)findViewById(R.id.buttonDiv);
        Button buttonEqual = (Button)findViewById(R.id.buttonEqual);




        resultText = (TextView)findViewById(R.id.editText);


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 0;
                prev_num = 0;
                first_num = 0;
                second_num = 0;
                operator = "null";
                resultText.setText(Double.toString(num));
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;

            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;*/

            }
        });

        button000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                prev_num *= 100;
                num = prev_num;

                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 1;
                prev_num += 1;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 2;
                prev_num += 2;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 3;
                prev_num += 3;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 4;
                prev_num += 4;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 5;
                prev_num += 5;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 6;
                prev_num += 6;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 7;
                prev_num += 7;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 8;
                prev_num += 8;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equal_flag == true){
                    num = 0;
                    prev_num = 0;
                    first_num = 0;
                    second_num = 0;
                    operator = "null";
                    equal_flag = false;
                }
                num = prev_num + 9;
                prev_num += 9;
                resultText.setText(Double.toString(num));
                prev_num *= 10;
                second_num = num;
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator != "null"){
                    num = first_num;
                }
                resultText.setText(Double.toString(num) + "+");
                operator = "+";
                first_num = num;
                num = 0;
                prev_num = 0;
                first_flag = false;
                equal_flag = false;
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator != "null"){
                    num = first_num;
                }
                resultText.setText(Double.toString(num) + "-");
                operator = "-";
                first_num = num;
                num = 0;
                prev_num = 0;
                first_flag = false;
                equal_flag = false;
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator != "null" && first_flag == false){
                    num = first_num;
                }
                resultText.setText(Double.toString(num) + "×");
                operator = "*";
                first_num = num;
                num = 0;
                prev_num = 0;
                first_flag = false;
                equal_flag = false;
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator != "null"){
                    num = first_num;
                }
                resultText.setText(Double.toString(num) + "÷");
                operator = "/";
                first_num = num;
                num = 0;
                prev_num = 0;
                first_flag = false;
                equal_flag = false;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(operator == "+"){
                    answer = first_num + second_num;
                }else if(operator == "-"){
                    answer = first_num - second_num;
                }else if(operator == "*"){
                    answer = first_num * second_num;
                }else if(operator == "/"){
                    answer = first_num / second_num;
                }else if(operator == "null"){
                    answer = num;
                }
                resultText.setText(Double.toString(answer));
                num = answer;
                first_num = num;
                equal_flag = true;

            }
        });

    }

}
