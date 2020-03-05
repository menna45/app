package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button button;
    TextView Login;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button)findViewById(R.id.loginbutton);
        Login = (TextView)findViewById(R.id.emailtext);
        password =(TextView)findViewById(R.id.passwordtext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(
                new Intent(MainActivity.this,ListActivity.class)
              );
            }
        });



    }





}
