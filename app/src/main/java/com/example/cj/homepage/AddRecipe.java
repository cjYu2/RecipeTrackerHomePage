package com.example.cj.homepage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Latisha on 3/10/18.
 */

public class AddRecipe extends Activity{
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        back = (Button)findViewById(R.id.button2) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_recipe);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddRecipe.this, MainActivity.class));
            }
        });

    }
}