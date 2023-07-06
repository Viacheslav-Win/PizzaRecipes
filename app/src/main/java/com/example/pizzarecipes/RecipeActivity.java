package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView textTitle = findViewById(R.id.titleTextView);
        TextView textRecipeView = findViewById(R.id.recipeTextView);


        Intent intent = getIntent();
        if (intent != null){
            textTitle.setText(intent.getStringExtra("name"));
            textRecipeView.setText(intent.getStringExtra("recipe"));
        }

    }
}