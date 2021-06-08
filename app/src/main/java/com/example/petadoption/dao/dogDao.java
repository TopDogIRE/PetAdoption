package com.example.petadoption.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.petadoption.entity.Dog;
import com.example.petadoption.models.DogsObj;

import java.util.List;

@Dao
public interface dogDao {
    @Query("SELECT * FROM dogs")
    LiveData<List<Dog>> getDogInfo();


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveSettings(Dog... dogs);

}
