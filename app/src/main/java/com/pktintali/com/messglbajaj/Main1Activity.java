package com.pktintali.com.messglbajaj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void dob1(View view) {
        Intent i2 = new Intent(this,m1break.class
        );
        startActivity(i2);
    }

    public void dolun1(View view) {
        Intent i3 = new Intent(this,m1lun.class
        );
        startActivity(i3);
    }

    public void dosnack1(View view) {
        Intent i4 = new Intent(this,m1snack.class);
        startActivity(i4);
    }

    public void dodinner1(View view) {
        Intent i5 = new Intent(this,m1dinner.class);
        startActivity(i5);
    }

    public void goback(View view) {
        finish();
    }
}
