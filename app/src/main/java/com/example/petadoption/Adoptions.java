package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Adoptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adoptions);
    }

    public void goToPost(View view) {
        Intent intent = new Intent(this, NewPostActivity.class);
        startActivity(intent);
    }

}

