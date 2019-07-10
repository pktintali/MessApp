package com.pktintali.com.messglbajaj;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    View view;
    private int activity_main;
    Calendar c= Calendar.getInstance();
    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void do1(View view) {
        Intent i1 = new  Intent  (this,Main1Activity.class);
        startActivity(i1);
    }


    public void auto(View view) {
        //setVisible(false);
        Intent i2 = new  Intent  (this,Main1Activity.class);
        Intent i3 = new  Intent  (this,MainActivity2.class);
        Intent i4 = new  Intent  (this,MainActivity3.class);
        Intent i1 = new  Intent  (this,MainActivity4.class);
        Intent i5 = new  Intent  (this,MainActivity5.class);
        Intent i6 = new  Intent  (this,MainActivity6.class);
        Intent i7 = new  Intent  (this,MainActivity7.class);
        if (Calendar.MONDAY ==dayOfWeek) {
            startActivity(i2);
        }
        else if(Calendar.TUESDAY ==dayOfWeek)
        {

            startActivity(i3);
        }
        else if(Calendar.WEDNESDAY ==dayOfWeek)
        {

            startActivity(i4);
        }
        else if(Calendar.THURSDAY ==dayOfWeek)
        {

            startActivity(i1);
        }
        else if(Calendar.FRIDAY ==dayOfWeek)
        {

            startActivity(i5);
        }
        else if(Calendar.SATURDAY ==dayOfWeek)
        {

            startActivity(i6);
        }
        else if(Calendar.SUNDAY ==dayOfWeek)
        {

            startActivity(i7);
        }
        else
        {
            setContentView(R.layout.activity_main8);
        }
    }

    public void dotue(View view) {
        Intent i2 = new Intent(this,MainActivity2.class);
        startActivity(i2);
    }

    public void dowed(View view) {
        Intent i3 = new Intent(this,MainActivity3.class);
        startActivity(i3);
    }

    public void dothu(View view) {
        Intent i4 = new Intent(this,MainActivity4.class);
        startActivity(i4);
    }

    public void dofri(View view) {
        Intent i5 = new Intent(this,MainActivity5.class);
        startActivity(i5);
    }

    public void dosat(View view) {
        Intent i6 = new Intent(this,MainActivity6.class);
        startActivity(i6);
    }

    public void dosun(View view) {
        Intent i7 = new Intent(this,MainActivity7.class);
        startActivity(i7);
    }

    public void info(View view) {
        Intent i9 = new Intent(this,Main8Activity.class);
        startActivity(i9);
    }
}
