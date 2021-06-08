package com.example.petadoption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView passView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToAdoptions(View view) {
        Intent intent = new Intent(this, Adoptions.class);
        textView = findViewById(R.id.user);
        passView = findViewById(R.id.pass);
        if(textView.getText().toString().matches("")){
            textView.setError("Cannot Be Blank!");
            return;
        }
        if(passView.getText().toString().matches("")){
            passView.setError("Cannot Be Blank!");
            return;
        }
        startActivity(intent);
    }


public void goToSignUp(View view) {
    Intent intent = new Intent(MainActivity.this, Signup.class);
    startActivity(intent);
}
public void goToAdoptions(View view) {
        Intent intent = new Intent(MainActivity.this, Adoptions.class);
    textView = findViewById(R.id.user);
    passView = findViewById(R.id.pass);
    if(textView.getText().toString().matches("")){
        textView.setError("Cannot Be Blank!");
        return;
    }
    if(passView.getText().toString().matches("")){
        passView.setError("Cannot Be Blank!");
        return;
    }
        startActivity(intent);
    }
}