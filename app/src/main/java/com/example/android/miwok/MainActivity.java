package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }

    });

        // Find the View that shows the Family category
        TextView family= (TextView) findViewById(R.id.family);

        //Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Family category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent i=new Intent(MainActivity.this,FamilyActivity.class);

                // Start the new activity
                startActivity(i);
            }
        });

        // Find the View that shows the Colors category
        TextView colors=(TextView) findViewById(R.id.colors);

        //Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Colors category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent i=new Intent(MainActivity.this,ColorsActivity.class);

                // Start the new activity
                startActivity(i);
            }
        });

        //Find the View that shows the phrases category
        TextView phrases=(TextView) findViewById(R.id.phrases);

        //Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Colors category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent i=new Intent(MainActivity.this,PhrasesActivity.class);

                // Start the new activity
                startActivity(i);
            }
        });

}
}