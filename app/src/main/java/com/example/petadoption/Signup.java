package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity{
    TextView textView;
    TextView passView;
    TextView nameView;
    TextView emailView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

    }
    public void goToAdoptions(View view) {
        Intent intent = new Intent(Signup.this, Adoptions.class);

     textView = findViewById(R.id.username);
     passView = findViewById(R.id.pword);
     nameView = findViewById(R.id.name);
     emailView = findViewById(R.id.email);
     if(textView.getText().toString().matches("")){
            textView.setError("Cannot Be Blank!");
            return;
        }
     if(passView.getText().toString().matches("")){
            passView.setError("Cannot Be Blank!");
            return;
        }
     if(nameView.getText().toString().matches("")){
            nameView.setError("Cannot Be Blank!");
            return;
        }
     if(emailView.getText().toString().matches("")){
            emailView.setError("Cannot Be Blank!");
            return;
        }
     startActivity(intent);
    }
}
