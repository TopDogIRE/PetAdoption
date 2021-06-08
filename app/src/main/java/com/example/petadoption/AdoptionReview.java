package com.example.petadoption;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//Start this view after user successfully post their pets for adoption
public class AdoptionReview extends AppCompatActivity {

    TextView name;
    Button bton;
    String url, dName;
    ImageView ivResult;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        //Hooks
        name = findViewById(R.id.petNameReview);
        ivResult = findViewById(R.id.img_review);
        url = getIntent().getExtras().getString("Link");

        dName = getIntent().getExtras().getString("Name");
        name.setText("Say Hello to "+dName);


        Picasso.get().load(url).into(ivResult);




    }




}
