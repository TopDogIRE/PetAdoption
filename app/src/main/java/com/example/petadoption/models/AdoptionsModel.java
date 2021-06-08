package com.example.petadoption.models;

import android.os.Parcel;
import android.os.Parcelable;

public class AdoptionsModel implements Parcelable {
    public String imageURL;
    public String uid;
    public String name;
    public  int age;
    public String breed;
    public String peteDes;
    public String peteLoc;
    protected AdoptionsModel() {
    }
    public AdoptionsModel(String imageURL, String name,int age,String breed,String peteDes, String peteLoc){
        this.name = name;
        this.imageURL = imageURL;
        this.age=age;
        this.breed=breed;
        this.peteDes=peteDes;
        this.peteLoc=peteLoc;
    }
    public AdoptionsModel (Parcel in){
        name = in.readString();
        age = in.readInt();
        imageURL = in.readString();
        breed = in.readString();
        peteDes = in.readString();
        peteLoc = in.readString();
    }


    public static final Creator<AdoptionsModel> CREATOR = new Creator<AdoptionsModel>() {
        @Override
        public AdoptionsModel createFromParcel(Parcel in) {
            return new AdoptionsModel(in);
        }

        @Override
        public AdoptionsModel[] newArray(int size) {
            return new AdoptionsModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(breed);
        dest.writeString(peteDes);
        dest.writeString(peteLoc);
        dest.writeString(imageURL);
    }
}
