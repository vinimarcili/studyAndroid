package com.example.unius.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    float numberA = 0;
    String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.result);
        text.setText("0");
    }

    public void clickButton(View view){
        switch (view.getId()) {
            case R.id.clear:
                text.setText("0");
                numberA = 0;
                operation = "";
                break;
            case R.id.plus:
                calcNumbers("+");
                break;
            case R.id.minus:
                calcNumbers("-");
                break;
            case R.id.division:
                calcNumbers("/");
                break;
            case R.id.multiply:
                calcNumbers("*");
                break;
            case R.id.equal:
                showResult();
                break;
            default:
                String numberB;
                numberB = ((Button)view).getText().toString();
                getKeyboard(numberB);
                break;
        }
    }

    public void calcNumbers(String type){
        numberA = Float.parseFloat(text.getText().toString());
        operation = type;
        text.setText("0");
    }

    public void getKeyboard(String str){
        String current = text.getText().toString();
        current += str;
        text.setText(current);
    }

    public void showResult(){
        float numberB = Float.parseFloat(text.getText().toString());
        float result = 0;

        switch (operation){
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }

        text.setText(String.valueOf(result));
    }
}
