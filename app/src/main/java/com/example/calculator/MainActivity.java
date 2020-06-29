package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,clean;
    Button btnsub,btnadd,btnmul,btndiv,btndot,btneql;
    EditText ed1;
    float res1,res2;
    boolean mul,div,sub,add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=findViewById(R.id.button14);
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button5);
        btn5=findViewById(R.id.button6);
        btn6=findViewById(R.id.button7);
        btn7=findViewById(R.id.button9);
        btn8=findViewById(R.id.button10);
        btn9=findViewById(R.id.button11);
        clean=findViewById(R.id.button17);
        btnmul=findViewById(R.id.button12);
        btndiv=findViewById(R.id.button16);
        btnsub=findViewById(R.id.button8);
        btnadd=findViewById(R.id.button4);
        ed1=findViewById(R.id.edittext);
        btndot=findViewById(R.id.button13);
        btneql=findViewById(R.id.button15);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null) {
                    ed1.setText("");
                }
                else {
                    res1=Float.parseFloat(ed1.getText()+"");
                    add=true;
                    ed1.setText(null);
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null) {
                    ed1.setText("");
                }
                else {
                    res1=Float.parseFloat(ed1.getText()+"");
                    sub=true;
                    ed1.setText(null);
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null) {
                    ed1.setText("");
                }
                else {
                    res1=Float.parseFloat(ed1.getText()+"");
                    mul=true;
                    ed1.setText(null);
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null) {
                    ed1.setText("");
                }
                else {
                    res1=Float.parseFloat(ed1.getText()+"");
                    div=true;
                    ed1.setText(null);
                }
            }
        });

        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Float.parseFloat(ed1.getText()+"");
                if (add==true){
                    ed1.setText(res1+res2+"");
                    add=false;
                }
                else if (sub==true){
                    ed1.setText(res1-res2+"");
                    sub=false;
                }
                else if (mul==true){
                    ed1.setText(res1*res2+"");
                    mul=false;
                }
                else if (div==true){
                    ed1.setText(res1/res2+"");
                    div=false;
                }
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                res1=0;
                res2=0;
            }
        });

    }
}