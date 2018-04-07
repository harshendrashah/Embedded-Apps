package com.shahharshendra.embeddedapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import javax.xml.transform.sax.SAXResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        final ArrayList<String> demoApps = new ArrayList<>();
        demoApps.add("Currency Converter");
        demoApps.add("Number Shapes");
        demoApps.add("Higher or Lower");
        demoApps.add("Basic Phrases");
        demoApps.add("Times Tables");
        demoApps.add("Time Counter");
        demoApps.add("Guess The Celebrity");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, demoApps);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, (position + 1) + ". " + demoApps.get(position), Toast.LENGTH_SHORT).show();

                Intent intent;

                switch (position) {
                    case 0 :
                        intent = new Intent(MainActivity.this, CurrencyConverterActivity.class);
                        break;
                    case 1 :
                        intent = new Intent(MainActivity.this, NumberShapesActivity.class);
                        break;
                    case 2 :
                        intent = new Intent(MainActivity.this, HigherOrLowerActivity.class);
                        break;
                    case 3 :
                        intent = new Intent(MainActivity.this, BasicPhrasesActivity.class);
                        break;
                    case 4 :
                        intent = new Intent(MainActivity.this, TimesTablesActivity.class);
                        break;
                    case 5 :
                        intent = new Intent(MainActivity.this, TimeCounterActivity.class);
                        break;
                    case 6 :
                        intent = new Intent(MainActivity.this, GuessTheCelebrityActivity.class);
                        break;
                    default:
                        intent = new Intent(MainActivity.this, MainActivity.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }

}
