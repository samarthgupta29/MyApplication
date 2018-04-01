package com.example.samarth.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textMessage = (TextView) findViewById(R.id.textView3);
                EditText editFriendName = (EditText) findViewById(R.id.editText3);
                String friendName = editFriendName.getText().toString();
                Date date=new Date();
                Calendar cal=Calendar.getInstance();
                cal.setTime(date);
                int hour=cal.get(Calendar.HOUR_OF_DAY);
                String greeting="";
                if(hour>=12 && hour<17){
                    greeting = "Good Afternoon";
                } else if(hour>= 17 && hour < 21){
                    greeting = "Good Evening";
                } else if(hour >= 21 && hour < 24){
                    greeting = "Good Night";
                } else {
                    greeting = "Good Morning";
                }

                //Change string displayed by TextView
                switch (view.getId()) {

                    case R.id.button6:

                        //set the string being displayed by the TextView to the greeting
                        //message for the friend
                        textMessage.setText( greeting + " " + friendName + "!");

                        break;

                    default:
                        break;
                }

            }
        });
    }
}
