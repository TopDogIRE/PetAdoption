package com.example.petadoption;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.petadoption.dao.dogDao;
import com.example.petadoption.entity.Dog;

@Database(entities = {Dog.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract dogDao settingsDao();
}