package com.pktintali.com.messglbajaj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void dob6(View view) {
        Intent i2 = new Intent(this,m6break.class
        );
        startActivity(i2);
    }

    public void dolun6(View view) {
        Intent i3 = new Intent(this,m6lunch.class
        );
        startActivity(i3);
    }

    public void dosnack6(View view) {
        Intent i4 = new Intent(this,m6snack.class);
        startActivity(i4);
    }

    public void dodinner6(View view) {
        Intent i5 = new Intent(this,m6dinner.class);
        startActivity(i5);
    }
}
