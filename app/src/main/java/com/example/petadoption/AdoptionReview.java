package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

//Start this view after user successfully post their pets for adoption
public class AdoptionReview extends AppCompatActivity {

    TextView name;
    Button bton, returnBton;
    String url, dName;
    ImageView ivResult;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        //Hooks
        name = findViewById(R.id.petNameReview);
        ivResult = findViewById(R.id.img_review);
        returnBton = findViewById(R.id.returnButton);

        url = getIntent().getExtras().getString("Link");
        dName = getIntent().getExtras().getString("Name");
        name.setText("Say Hello to " + dName);


        Picasso.get().load(url).into(ivResult);

        returnBton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdoptionReview.this, Adoptions.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
