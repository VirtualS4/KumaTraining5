package com.example.rona.kumatraining5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Beartivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity);
        final Intent bearsense = new Intent(Beartivity.this,Beartivity2.class);

        Intent panggil = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3schools.com"));

        initEvent(findViewById(R.id.btn),bearsense);
        initEvent(findViewById(R.id.btn2),panggil);


    }

    private void initEvent(View bearbutton,final Intent bear){
        bearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bear);
            }
        });
    }


}
