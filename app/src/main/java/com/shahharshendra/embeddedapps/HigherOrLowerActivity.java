package com.shahharshendra.embeddedapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class HigherOrLowerActivity extends AppCompatActivity {

    Random rand = new Random();
    int r ;

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
    public void checkTheGuess(View view){

        EditText editText = (EditText) findViewById(R.id.editTextHOL);
        int guess = Integer.parseInt(editText.getText().toString());

        if(r < guess){
            makeToast("Lower!");
            editText.setText(null);
        }
        else if (r == guess){
            makeToast("You guessed correct!");
            editText.setText(null);
            makeToast("Give it another shot!");
            r = 1 + rand.nextInt(20);
        }
        else {
            makeToast("Higher!");
            editText.setText(null);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_higher_or_lower);
        r = 1 + rand.nextInt(20);
    }
}
