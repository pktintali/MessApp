package com.pktintali.com.messglbajaj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void dob3(View view) {
        Intent i2 = new Intent(this,m3break.class
        );
        startActivity(i2);
    }

    public void dolun3(View view) {
        Intent i3 = new Intent(this,m3lunch.class
        );
        startActivity(i3);
    }

    public void dosnack3(View view) {
        Intent i4 = new Intent(this,m3snack.class);
        startActivity(i4);
    }

    public void dodinner3(View view) {
        Intent i5 = new Intent(this,m3dinner.class);
        startActivity(i5);
    }
}
