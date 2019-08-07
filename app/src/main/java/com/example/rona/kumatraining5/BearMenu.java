package com.example.rona.kumatraining5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BearMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bear_menu);
        final Intent bearsense = new Intent(BearMenu.this,Beartivity.class);
        Intent panggil = new Intent(BearMenu.this,Beartivity3.class);
        initEvent(findViewById(R.id.btn),bearsense);
        initEvent(findViewById(R.id.btn2),panggil);
    }

    private void initEvent(View bearbutton, final Intent bearsense){
        bearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bearsense);
            }
        });
    }
}
