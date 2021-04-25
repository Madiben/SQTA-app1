package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.tools.CodeNeptune;
import com.example.myapplication.tools.CountAscii;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonaction1);
        Button button1 = (Button) findViewById(R.id.buttonaction2);

        EditText editText = (EditText) findViewById(R.id.editText);
        final TextView text = (TextView) findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sentance= editText.getText().toString();
                CodeNeptune Cn = new CodeNeptune();
                text.setText(Cn.codesentance(sentance));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountAscii Ca = new CountAscii();
                String sentanc= editText.getText().toString();
                text.setText(String.valueOf(Ca.SumAscii(sentanc)));
            }
        });
    }
}