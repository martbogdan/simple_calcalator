package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnDivide;
    Button btnMultiply;
    Button btnMinus;
    Button btnPlus;
    Button btnEqual;
    Button btnDel;
    Button btnPoint;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.dialScreen);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnPoint = (Button) findViewById(R.id.btnPoint);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("1");
                } else {
                    textView.setText(textView.getText() + "1");
                }
                break;
            case R.id.btn2:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("2");
                } else {
                    textView.setText(textView.getText() + "2");
                }
                break;
            case R.id.btn3:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("3");
                } else {
                    textView.setText(textView.getText() + "3");
                }
                break;
            case R.id.btn4:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("4");
                } else {
                    textView.setText(textView.getText() + "4");
                }
                break;
            case R.id.btn5:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("5");
                } else {
                    textView.setText(textView.getText() + "5");
                }
                break;
            case R.id.btn6:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("6");
                } else {
                    textView.setText(textView.getText() + "6");
                }
                break;
            case R.id.btn7:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("7");
                } else {
                    textView.setText(textView.getText() + "7");
                }
                break;
            case R.id.btn8:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("8");
                } else {
                    textView.setText(textView.getText() + "8");
                }
                break;
            case R.id.btn9:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("9");
                } else {
                    textView.setText(textView.getText() + "9");
                }
                break;
            case R.id.btn0:
                if (textView.getText().length() == 1 && textView.getText().equals("0")) {
                    textView.setText("0");
                } else {
                    textView.setText(textView.getText() + "0");
                }
                break;
            case R.id.btnDel:
                textView.setText("0");
                break;
            case R.id.btnPoint:
                String checkPoint = (String) textView.getText();
                if (!checkPoint.contains(".")) {
                    textView.setText(textView.getText() + ".");
                }
                break;

        }

    }
}
