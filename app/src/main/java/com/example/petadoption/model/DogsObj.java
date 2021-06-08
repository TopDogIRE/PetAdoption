package com.example.petadoption.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.database.IgnoreExtraProperties;

public class DogsObj {
    public String uid;
    public String dogName;
    public String dogAge;
    public String dogBreed;
    public String dogDescription;
    public String dogLoc;
    public String imageURL;

    public DogsObj(){

    }

    public DogsObj(String dogName, String dogAge, String dogBreed, String dogDescription, String dogLoc, String imageURL){
        dogName = this.dogName;
        dogAge = this.dogAge;
        dogBreed = this.dogBreed;
        dogDescription = this.dogDescription;
        dogLoc = this.dogLoc;
        imageURL = this.imageURL;

    }

    public DogsObj(Parcel in){
        dogName = in.readString();
        dogAge = in.readString();
        dogBreed = in.readString();
        dogDescription = in.readString();
        dogLoc = in.readString();
        imageURL = in.readString();
    }

}
