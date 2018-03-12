package com.example.cj.homepage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Latisha on 3/10/18.
 */

public class BreakfastPage extends AppCompatActivity{

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_recipe);

        final Button back = (Button)findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(BreakfastPage.this, MainActivity.class));
            }
        });

    }
}
