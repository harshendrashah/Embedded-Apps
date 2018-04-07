package com.shahharshendra.embeddedapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CurrencyConverterActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarEditText = findViewById(R.id.editTextCc);
        Double dollarAmmountDouble = Double.parseDouble(dollarEditText.getText().toString());
        Double poundAmmount = dollarAmmountDouble * 0.75 ;

        Toast.makeText(CurrencyConverterActivity.this, String.format("%.2f",poundAmmount),Toast.LENGTH_SHORT).show();


        Log.i("amount", dollarEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
    }
}
