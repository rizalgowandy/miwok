package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        if (numbers != null)
            numbers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }
            });

        TextView colors = (TextView) findViewById(R.id.colors);
        if (colors != null)
            colors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorsIntent);
                }
            });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        if (phrases != null)
            phrases.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                }
            });

        TextView familyMembers = (TextView) findViewById(R.id.family);
        if (familyMembers != null)
            familyMembers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent familyMembersIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                    startActivity(familyMembersIntent);
                }
            });

    }
}
