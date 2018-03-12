package com.example.cj.homepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button add = (Button)findViewById(R.id.addRecipe);
        final Button breakfasts=(Button)findViewById(R.id.breakfast);
        final Button lunchs = (Button)findViewById(R.id.lunch);
        final Button dinners=(Button)findViewById(R.id.dinner);



        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddRecipe.class));
            }
        });

        breakfasts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BreakfastPage.class));
            }
        });
        lunchs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LunchPage.class));
            }
        });
        dinners.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DinnerPage.class));
            }
        });

    }
}
