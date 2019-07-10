package com.pktintali.com.messglbajaj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void dob4(View view) {
        Intent i2 = new Intent(this,m4break.class
        );
        startActivity(i2);
    }

    public void dolun4(View view) {
        Intent i3 = new Intent(this,m4lunch.class
        );
        startActivity(i3);
    }

    public void dosnack4(View view) {
        Intent i4 = new Intent(this,m4snack.class);
        startActivity(i4);
    }

    public void dodinner4(View view) {
        Intent i5 = new Intent(this,m4dinner.class);
        startActivity(i5);
    }
}
