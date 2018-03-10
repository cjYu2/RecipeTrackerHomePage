package com.example.cj.homepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button add;
    Button breakfast;
    Button lunch;
    Button dinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        add = (Button)findViewById(R.id.addRecipe);
        breakfast=(Button)findViewById(R.id.breakfast);
        lunch = (Button)findViewById(R.id.lunch);
        dinner=(Button)findViewById(R.id.dinner);

        setContentView(R.layout.activity_main);

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddRecipe.class));
            }
        });

        breakfast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BreakfastPage.class));
            }
        });
        lunch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LunchPage.class));
            }
        });
        dinner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DinnerPage.class));
            }
        });

    }
}
