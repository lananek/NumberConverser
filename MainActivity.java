package com.example.numberconverser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button16 = (Button)findViewById(R.id.button16);
        EditText editText = (EditText)findViewById(R.id.editText);
        View.OnClickListener hex = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),Integer.toHexString(Integer.parseInt(editText.getText().toString())),
                       Toast.LENGTH_LONG).show();

            }
        };
        button16.setOnClickListener(hex);
        View.OnClickListener oct = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),Integer.toOctalString(Integer.parseInt(editText.getText().toString())),
                        Toast.LENGTH_LONG).show();
            }
        };
        button8.setOnClickListener(oct);
        View.OnClickListener bin = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),Integer.toBinaryString(Integer.parseInt(editText.getText().toString())),
                        Toast.LENGTH_LONG).show();
            }
        };
        button2.setOnClickListener(bin);
    }
}
