package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnDivide, btnMultiply, btnMinus, btnPlus, btnEqual;
    Button btnDel, btnPoint;

    TextView textView;

    @SuppressLint("SetTextI18n")
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
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                textView.setText(checkZeroFirst(textView) ? "1" : textView.getText() + "1");
                break;
            case R.id.btn2:
                textView.setText(checkZeroFirst(textView) ? "2" : textView.getText() + "2");
                break;
            case R.id.btn3:
                textView.setText(checkZeroFirst(textView) ? "3" : textView.getText() + "3");
                break;
            case R.id.btn4:
                textView.setText(checkZeroFirst(textView) ? "4" : textView.getText() + "4");
                break;
            case R.id.btn5:
                textView.setText(checkZeroFirst(textView) ? "5" : textView.getText() + "5");
                break;
            case R.id.btn6:
                textView.setText(checkZeroFirst(textView) ? "6" : textView.getText() + "6");
                break;
            case R.id.btn7:
                textView.setText(checkZeroFirst(textView) ? "7" : textView.getText() + "7");
                break;
            case R.id.btn8:
                textView.setText(checkZeroFirst(textView) ? "8" : textView.getText() + "8");
                break;
            case R.id.btn9:
                textView.setText(checkZeroFirst(textView) ? "9" : textView.getText() + "9");
                break;
            case R.id.btn0:
                textView.setText(checkZeroFirst(textView) ? "0" : textView.getText() + "0");
                break;
            case R.id.btnDel:
                textView.setText("0");
                break;
            case R.id.btnPoint:
                String checkPoint = (String) textView.getText();
                if (!checkPoint.contains(".") || isOperationSymbolPresent(textView)) {
                    textView.setText(textView.getText() + ".");
                }
                break;
            case R.id.btnDivide:
                if (checkLastOperationIndex(textView)) {
                    textView.setText(textView.getText() + "÷");
                }
                if (isOperationSymbolPresent(textView)) {
                    textView.setText(String.valueOf(getResult(textView)));
                }
                break;
            case R.id.btnMultiply:
                if (checkLastOperationIndex(textView)) {
                    textView.setText(textView.getText() + "*");
                }
                if (isOperationSymbolPresent(textView)) {
                    textView.setText(String.valueOf(getResult(textView)));
                }
                break;
            case R.id.btnMinus:
                if (checkLastOperationIndex(textView)) {
                    textView.setText(textView.getText() + "-");
                }
                if (isOperationSymbolPresent(textView)) {
                    textView.setText(String.valueOf(getResult(textView)));
                }
                break;
            case R.id.btnPlus:
                if (checkLastOperationIndex(textView)) {
                    textView.setText(textView.getText() + "+");
                }
                if (isOperationSymbolPresent(textView)) {
                    textView.setText(String.valueOf(getResult(textView)));
                }
                break;
            case R.id.btnEqual:
                textView.setText(String.valueOf(getResult(textView)));
                break;
        }

    }

    private static boolean checkLastOperationIndex(TextView textView) {
        String checkLast = (String) textView.getText();
        char carLast = checkLast.charAt(checkLast.length() - 1);
        return carLast != '÷' && carLast != '*' && carLast != '-' && carLast != '+';
    }

    private static boolean isOperationSymbolPresent(TextView textView) {
        String text = (String) textView.getText();
        String checkSymbol = text.substring(0, text.length() - 1);
        return checkSymbol.contains("+") || checkSymbol.contains("-") || checkSymbol.contains("*") || checkSymbol.contains("÷");
    }

    private static boolean checkZeroFirst(TextView textView) {
        return textView.getText().length() == 1 && textView.getText().equals("0");
    }

    @SuppressLint("SetTextI18n")
    private static double getResult(TextView textView) {
        double d1 = 0.0, d2 = 0.0, result = 0.0;
        char operation = 0;
        String text = (String) textView.getText();
        if (text.contains("+") || text.contains("-") || text.contains("*") || text.contains("÷")) {
            String[] numbers = text.split("[+*÷\\-]");
            d1 = Double.parseDouble(numbers[0]);
            d2 = Double.parseDouble(numbers[1]);
            for (char c : text.toCharArray()) {
                if (c == '÷' || c == '*' || c == '-' || c == '+') {
                    operation = c;
                    break;
                }
            }
            switch (String.valueOf(operation)) {
                case "÷":
                    if (d2 == 0) {
                        textView.setText("Error division by 0");
                    } else {
                        result = d1 / d2;
                    }
                    break;
                case "*":
                    result = d1 * d2;
                    break;
                case "-":
                    result = d1 - d2;
                    break;
                case "+":
                    result = d1 + d2;
                    break;
            }
        } else {
            result = Double.parseDouble(text);
        }

        return result;
    }
}
