package com.pktintali.com.messglbajaj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void dob2(View view) {
        Intent i2 = new Intent(this,m2break.class
        );
        startActivity(i2);
    }

    public void dolun2(View view) {
        Intent i3 = new Intent(this,m2lunch.class
        );
        startActivity(i3);
    }

    public void dosnack2(View view) {
        Intent i4 = new Intent(this,m2snack.class);
        startActivity(i4);
    }

    public void dodinner2(View view) {
        Intent i5 = new Intent(this,m2dinner.class);
        startActivity(i5);
    }
}
