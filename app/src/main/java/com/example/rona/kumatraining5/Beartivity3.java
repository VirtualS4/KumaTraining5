package com.example.rona.kumatraining5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Beartivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity3);


        initEvent(findViewById(R.id.plus1),findViewById(R.id.plus2),findViewById(R.id.hasilplus),findViewById(R.id.btnplus),"+");
        initEvent(findViewById(R.id.minus1),findViewById(R.id.minus2),findViewById(R.id.hasilminus),findViewById(R.id.btnminus),"-");
        initEvent(findViewById(R.id.kali1),findViewById(R.id.kali2),findViewById(R.id.hasilkali),findViewById(R.id.btnkali),"*");
        initEvent(findViewById(R.id.bagi1),findViewById(R.id.bagi2),findViewById(R.id.hasilbagi),findViewById(R.id.btnbagi),"/");


        final Intent next = new Intent(Beartivity3.this,Beartivity4.class);

        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(next);
            }
        });
    }

    public void Hitung(View angka1,View angka2,View hasil,String proses){
        int count1 = Integer.parseInt( ((EditText) angka1).getText().toString());
        int count2 = Integer.parseInt( ((EditText) angka2).getText().toString());

        switch (proses){
            case "+" :
                ((EditText)hasil).setText((count1+count2)+"");
                break;
            case "-" :
                ((EditText)hasil).setText((count1-count2)+"");
                break;
            case "*" :
                ((EditText)hasil).setText((count1*count2)+"");
                break;
            case "/" :
                ((EditText)hasil).setText((count1/count2)+"");
                break;
        }

    }
    private void initEvent(final View angka1,final View angka2,final View hasil,View btn,final String proses){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung(angka1,angka2,hasil,proses);
            }
        });
    }
}
