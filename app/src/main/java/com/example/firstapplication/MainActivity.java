package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view)
    {



        //TextView textSelect = findViewById(R.id.txt1);
        //textSelect.setText("Charles Dantas");
    }

    public void changeNumber(View view)
    {
        TextView txt = findViewById(R.id.txtResult);
        int num = new Random().nextInt(11);
        txt.setText("Result: " + num);
    }
}