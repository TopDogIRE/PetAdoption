package com.example.petadoption.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.petadoption.entity.Dog;

import java.util.List;

@Dao
public interface dogDao {
    @Query("SELECT * FROM dogs")
    LiveData<List<Dog>> getDogInfo();
}
