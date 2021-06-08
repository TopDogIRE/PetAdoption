package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewPostActivity extends AppCompatActivity {
    EditText dogName, dogAge, dogBreed, dogCity, dogDes, imgURL;
    Button postBton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        //Hooks
        dogName = findViewById(R.id.dogName);
        dogAge = findViewById(R.id.age);
        dogBreed = findViewById(R.id.breed);
        dogCity = findViewById(R.id.location);
        dogDes = findViewById(R.id.description);
        postBton = findViewById(R.id.postButton);
        imgURL = findViewById(R.id.img);




        postBton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fieldValid()) {
                    Intent intent = new Intent(NewPostActivity.this, AdoptionReview.class);
                    intent.putExtra("Link",imgURL.getText().toString());
                    intent.putExtra("Name",dogName.getText().toString());
                    startActivity(intent);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Fields cannot be blank",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
//    Comment out to test new conflicts
//    public void backToAdoptions(View view) {
//        Intent intent = new Intent(this, Adoptions.class);
//        startActivity(intent);
//    }

    //Check if every EditTexts are filled
    public boolean fieldValid() {

        String dName = dogName.getText().toString();
        String dAge = dogAge.getText().toString();
        String dCity = dogCity.getText().toString();
        String dBreed = dogBreed.getText().toString();
        String dDes = dogDes.getText().toString();
        String img = imgURL.getText().toString();

        if(dName.length()>0 && dAge.length()>0 && dBreed.length()>0 && dCity.length()>0 && dDes.length()>0 && img.length()>0){
            return true;
        }
        return false;


    }



}
