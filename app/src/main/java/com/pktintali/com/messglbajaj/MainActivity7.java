package com.pktintali.com.messglbajaj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    public void dob7(View view) {
        Intent i2 = new Intent(this,m7break.class
        );
        startActivity(i2);
    }

    public void dolun7(View view) {
        Intent i3 = new Intent(this,m7lunch.class
        );
        startActivity(i3);
    }

    public void dosnack7(View view) {
        Intent i4 = new Intent(this,m7snack.class);
        startActivity(i4);
    }

    public void dodinner7(View view) {
        Intent i5 = new Intent(this,m7dinner.class);
        startActivity(i5);
    }
}
