package govardhan.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0But = findViewById(R.id.num0);
        Button num1But = findViewById(R.id.num1);
        Button num2But = findViewById(R.id.num2);
        Button num3But = findViewById(R.id.num3);
        Button num4But = findViewById(R.id.num4);
        Button num5But = findViewById(R.id.num5);
        Button num6But = findViewById(R.id.num6);
        Button num7But = findViewById(R.id.num7);
        Button num8But = findViewById(R.id.num8);
        Button num9But = findViewById(R.id.num9);
        Button pointBut = findViewById(R.id.numPoint);
        Button plusBut = findViewById(R.id.plusBut);
        Button minusBut = findViewById(R.id.minusBut);
        Button multiplyBut = findViewById(R.id.multBut);
        Button divideBut = findViewById(R.id.divBut);
        Button equalsBut = findViewById(R.id.equalsBut);
        Button clearBut = findViewById(R.id.clearBut);
        EditText expressionEdtTxt = findViewById(R.id.expressionEdt);
        TextView answerTxt = findViewById(R.id.answer);

        expressionEdtTxt.setInputType(InputType.TYPE_NULL);

        final String[] temp = {""};

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        num0But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "0";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num1But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "1";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num2But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "2";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num3But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "3";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num4But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "4";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num5But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "5";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num6But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "6";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num7But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "7";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num8But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "8";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        num9But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "9";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        pointBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + ".";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        plusBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "+";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        minusBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "-";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        multiplyBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "*";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        divideBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp[0] = expressionEdtTxt.getText() + "/";
                expressionEdtTxt.setText(temp[0]);
            }
        });

        equalsBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mathOperation = expressionEdtTxt.getText().toString();
                try {
                    Object result = engine.eval(mathOperation);
                    answerTxt.setText(result.toString());
                    Log.d("Calculator", "Operation: " + mathOperation + " result: " + result);
                } catch (ScriptException e) {
                    Log.d("Calculator", " ScriptEngine error: " + e.getMessage());
                }
            }
        });

        clearBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressionEdtTxt.setText("");
                answerTxt.setText("");
                answerTxt.setHint("Answer here");
            }
        });
    }
}