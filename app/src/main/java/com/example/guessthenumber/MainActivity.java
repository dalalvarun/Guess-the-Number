package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    static Random rand = new Random();
    static int a = rand.nextInt(20)+1;
    public void check(View view)
    {
        EditText check = (EditText) findViewById(R.id.editTextNumber);
        try {
            int b = Integer.parseInt(check.getText().toString());
            if(a==b)
            {
                Toast.makeText(this, "You guessed it correct. Starting new game", Toast.LENGTH_LONG).show();
                a = rand.nextInt(20)+1;
            }
            else if(a>b) {
                Toast.makeText(this, "Think Big!!!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Think Small!!!", Toast.LENGTH_SHORT).show();
            }
            check.setText("");
        }
        catch(NumberFormatException e) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
    }


}