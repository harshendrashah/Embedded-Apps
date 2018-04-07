package com.shahharshendra.embeddedapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NumberShapesActivity extends AppCompatActivity {

    class Number{

        int number;

        public boolean isSquare(){
            double squareroot = Math.sqrt(number);
            if(squareroot == Math.floor(squareroot)){
                return true;
            }
            else
                return false;
        }

        public boolean isTriangular(){
            int x = 1, triangularnumber = 1;
            while (triangularnumber < number){
                x++;
                triangularnumber += x;
            }
            if (triangularnumber == number){
                return true;
            }
            else
                return false;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_shapes);

    }

    public  void onButtonClick(View view){

        String message;
        EditText input = findViewById(R.id.inputNS);

        if(input.getText().toString().isEmpty())
            message = "Please Enter a Number";
        else {

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(input.getText().toString());

            if (myNumber.isSquare()) {
                if (myNumber.isTriangular())
                    message = myNumber.number + " is both Square and Triangular!";
                else
                    message = myNumber.number + " is Square but not Triangular.";
            } else {
                if (myNumber.isTriangular())
                    message = myNumber.number + " is Triangular but not Square.";
                else
                    message = myNumber.number + " is neither Square nor Triangular.";
            }
        }

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();


    }
}
