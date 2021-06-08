package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity  extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    }

    public void goToPost(View view) {
        Intent intent = new Intent(this, NewPostActivity.class);

        startActivity(intent);
    }


}
