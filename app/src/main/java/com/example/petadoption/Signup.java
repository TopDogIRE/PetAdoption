package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

    }
    public void goToAdoptions(View view) {
        Intent intent = new Intent(Signup.this, Adoptions.class);

        startActivity(intent);
    }
}
