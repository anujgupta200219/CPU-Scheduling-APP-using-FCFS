package com.example.h1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    TextView et1,et2; //value for tat and wt
    TextView t1,t2,t3,t4,t5,t6,t7; // value for gantt chart

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);

        String s1= getIntent().getStringExtra("k1");
        String s2= getIntent().getStringExtra("k2");
        //value for gantt chart
        String s3= getIntent().getStringExtra("k3");
        String s4= getIntent().getStringExtra("k4");
        String s5= getIntent().getStringExtra("k5");
        String s6= getIntent().getStringExtra("k6");
        String s7= getIntent().getStringExtra("k7");
        String s8= getIntent().getStringExtra("k8");
        String s9= getIntent().getStringExtra("k9");
        //button value
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);

        String s10= getIntent().getStringExtra("k10");
        String s11= getIntent().getStringExtra("k11");
        String s12= getIntent().getStringExtra("k12");
        String s13= getIntent().getStringExtra("k13");
        String s14= getIntent().getStringExtra("k14");
        String s15= getIntent().getStringExtra("k15");
        //value button set

        b1.setText(s10);
        b2.setText(s11);
        b3.setText(s12);
        b4.setText(s13);
        b5.setText(s14);
        b6.setText(s15);

        et1.setText(s1);
        et2.setText(s2);
        //value for gantt chart
        t1.setText(s3);
        t2.setText(s4);
        t3.setText(s5);
        t4.setText(s6);
        t5.setText(s7);
        t6.setText(s8);
        t7.setText(s9);
    }
}
