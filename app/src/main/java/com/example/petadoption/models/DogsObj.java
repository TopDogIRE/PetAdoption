package com.example.petadoption.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.database.IgnoreExtraProperties;

public class DogsObj {
    public String uid;
    public String dogName;
    public int dogAge;
    public String dogGender;
    public String dogBreed;
    public String dogDescription;
    public String dogLoc;
    public String imageURL;

    public DogsObj(){

    }

    public DogsObj(String dogName, int dogAge, String dogBreed, String dogGender, String dogDescription, String dogLoc, String imageURL){
        dogName = this.dogName;
        dogAge = this.dogAge;
        dogBreed = this.dogBreed;
        dogGender = this.dogGender;
        dogDescription = this.dogDescription;
        dogLoc = this.dogLoc;
        imageURL = this.imageURL;

    }

    public DogsObj(Parcel in){
        dogName = in.readString();
        dogAge = in.readInt();
        dogBreed = in.readString();
        dogDescription = in.readString();
        dogLoc = in.readString();
        imageURL = in.readString();
    }

}
