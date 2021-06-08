package com.example.petadoption.entity;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dog {
    @PrimaryKey(autoGenerate = true)
    private int dogID;

    @ColumnInfo(name = "city")
    private String dogCity;

    @ColumnInfo(name = "breed")
    private String dogBreed;

    @ColumnInfo(name = "description")
    private String dogDescription;

    @ColumnInfo(name = "gender")
    private String dogGender;

    @ColumnInfo(name = "imageURL")
    private String dogImg;

    @ColumnInfo(name = "name")
    private String dogName;
}
