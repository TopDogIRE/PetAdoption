package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewPostActivity extends AppCompatActivity {
    TextView dogName;
    TextView dogAge;
    TextView dogBreed;
    TextView dogCity;
    TextView dogDes;
    TextView imgURL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }

    public void backToAdoptions(View view) {
        Intent intent = new Intent(this, Adoptions.class);
        startActivity(intent);
    }
    public void postDog(View view) {
        Intent intent = new Intent(this, Adoptions.class);
        dogName = findViewById(R.id.dogName);
        dogAge = findViewById(R.id.age);
        dogBreed = findViewById(R.id.breed);
        dogCity = findViewById(R.id.location);
        dogDes = findViewById(R.id.img);

        if(dogName.getText().toString().matches("")){
            dogName.setError("Name cannot be Blank");
            return;
        }
        if(dogAge.getText().toString().matches("")){
            dogAge.setError("Age cannot be blank");
            return;
        }if(dogBreed.getText().toString().matches("")){
            dogBreed.setError("Breed cannot be blank");
            return;
        }if(dogCity.getText().toString().matches("")){
            dogCity.setError("City cannot be blank");
            return;
        }if(dogDes.getText().toString().matches("")){
            dogDes.setError("Description cannot be blank");
            return;
        }



        startActivity(intent);
    }

}
