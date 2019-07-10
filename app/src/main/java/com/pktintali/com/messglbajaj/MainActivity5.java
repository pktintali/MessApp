package com.pktintali.com.messglbajaj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void dob5(View view) {
        Intent i2 = new Intent(this,m5break.class
        );
        startActivity(i2);
    }

    public void dolun5(View view) {
        Intent i3 = new Intent(this,m5lunch.class
        );
        startActivity(i3);
    }

    public void dosnack5(View view) {
        Intent i4 = new Intent(this,m5snack.class);
        startActivity(i4);
    }

    public void dodinner5(View view) {
        Intent i5 = new Intent(this,m5dinner.class);
        startActivity(i5);
    }
}
