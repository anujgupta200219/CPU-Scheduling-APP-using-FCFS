package com.example.h1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button cal;
    EditText at1,at2,at3,at4,at5,at6,bt1,bt2,bt3,bt4,bt5,bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        at1 = findViewById(R.id.at1);
        at2 = findViewById(R.id.at2);
        at3 = findViewById(R.id.at3);
        at4 = findViewById(R.id.at4);
        at5 = findViewById(R.id.at5);
        at6 = findViewById(R.id.at6);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        cal = findViewById(R.id.button);



        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    int at[] = new int[6];

                    at[0] = Integer.parseInt(at1.getText().toString());
                    at[1] = Integer.parseInt(at2.getText().toString());
                    at[2] = Integer.parseInt(at3.getText().toString());
                    at[3] = Integer.parseInt(at4.getText().toString());
                    at[4] = Integer.parseInt(at5.getText().toString());
                    at[5] = Integer.parseInt(at6.getText().toString());

                    int bt[] = new int[6];
                    bt[0] = Integer.parseInt(bt1.getText().toString());
                    bt[1] = Integer.parseInt(bt2.getText().toString());
                    bt[2] = Integer.parseInt(bt3.getText().toString());
                    bt[3] = Integer.parseInt(bt4.getText().toString());
                    bt[4] = Integer.parseInt(bt5.getText().toString());
                    bt[5] = Integer.parseInt(bt6.getText().toString());

                    String p[] = new String[6];
                    p[0] = "p1";
                    p[1] = "p2";
                    p[2] = "p3";
                    p[3] = "p4";
                    p[4] = "p5";
                    p[5] = "p6";


                    for (int i = 0; i < 6; i++) {
                        for (int j = i + 1; j < 6; j++) {
                            int att;
                            int btt;
                            String pt;
                            if (at[i] > at[j]) {
                                att = at[i];
                                at[i] = at[j];
                                at[j] = att;

                                btt = bt[i];
                                bt[i] = bt[j];
                                bt[j] = btt;

                                pt = p[i];
                                p[i] = p[j];
                                p[j] = pt;
                            }
                        }
                    }
                    int g[] = new int[6];

                    int d = at[0];
                    float wt = 0;
                    float tat = 0;
                    for (int i = 0; i < 6; i++) {
                        wt = wt + d - at[i];
                        d = d + bt[i];
                        tat = tat + d - at[i];
                        g[i] = d;
                    }
                    wt = wt / 6;
                    tat = tat / 6;
                    String s3 = String.valueOf(wt);
                    String s4 = String.valueOf(tat);

                    String t1 = String.valueOf(at[0]);
                    String t2 = String.valueOf(g[0]);
                    String t3 = String.valueOf(g[1]);
                    String t4 = String.valueOf(g[2]);
                    String t5 = String.valueOf(g[3]);
                    String t6 = String.valueOf(g[4]);
                    String t7 = String.valueOf(g[5]);


                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("k1", s3);
                    intent.putExtra("k2", s4);
                    // for sending value in gantt chart
                    intent.putExtra("k3", t1);
                    intent.putExtra("k4", t2);
                    intent.putExtra("k5", t3);
                    intent.putExtra("k6", t4);
                    intent.putExtra("k7", t5);
                    intent.putExtra("k8", t6);
                    intent.putExtra("k9", t7);

                    intent.putExtra("k10", p[0]);
                    intent.putExtra("k11", p[1]);
                    intent.putExtra("k12", p[2]);
                    intent.putExtra("k13", p[3]);
                    intent.putExtra("k14", p[4]);
                    intent.putExtra("k15", p[5]);
                    startActivity(intent);
            }
        });
    }
}




