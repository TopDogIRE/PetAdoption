package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity{
    private TextView textView;
    private TextView passView;
    private TextView nameView;
    private TextView emailView;

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
     if(!isValidEmail(emailView.getText())){
           emailView.setError("Email not valid!");
           return;
        }

        startActivity(intent);
    }
    public boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }
}
