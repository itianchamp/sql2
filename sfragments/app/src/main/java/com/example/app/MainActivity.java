package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText txt1;
    private TextView txt2;
private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
btn=(Button)findViewById(R.id.btn);
txt1=(EditText)findViewById(R.id.txt1);
        txt2=(TextView) findViewById(R.id.txt2);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(txt1.getText().toString())){
            txt2.setText("Please enter a letter");

        }

           else if(txt1.getText().toString().length()>1){
                txt2.setText("Enter a single letter please");
            }
            else if(txt1.getText().toString().equals("a")||txt1.getText().toString().equals("c")||txt1.getText().toString().equals("e")
                ||txt1.getText().toString().equals("e")||txt1.getText().toString().equals("i")||txt1.getText().toString().equals("m")
                ||txt1.getText().toString().equals("n")||txt1.getText().toString().equals("o")||txt1.getText().toString().equals("r")
                ||txt1.getText().toString().equals("s")||txt1.getText().toString().equals("u")||txt1.getText().toString().equals("v")
                ||txt1.getText().toString().equals("w")||txt1.getText().toString().equals("x")||txt1.getText().toString().equals("z")){

                txt2.setText("Grass Letter");
            }
            else if(txt1.getText().toString().equals("b")||txt1.getText().toString().equals("d")||txt1.getText().toString().equals("f")
                ||txt1.getText().toString().equals("h")||txt1.getText().toString().equals("k")||txt1.getText().toString().equals("l")
                ||txt1.getText().toString().equals("t")){
            txt2.setText("Sky Letter");
        }
            else if(txt1.getText().toString().equals("g")||txt1.getText().toString().equals("j")||txt1.getText().toString().equals("p")
                    ||txt1.getText().toString().equals("q")||txt1.getText().toString().equals("y")){
            txt2.setText("Root Letter");
        }
            else{
            txt2.setText("Not Detected");
        }

    }
});



    }

}