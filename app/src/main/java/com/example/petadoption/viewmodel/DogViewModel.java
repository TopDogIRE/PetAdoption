package com.example.petadoption.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.petadoption.AppDatabase;
import com.example.petadoption.AppDatabaseSingleton;
import com.example.petadoption.entity.Dog;

import java.util.List;


public class DogViewModel extends ViewModel {
    public void saveSettings(Context context, Dog... dogs) {
        AppDatabase db = AppDatabaseSingleton.getDatabase(context);
        db.getTransactionExecutor().execute(() -> {
            db.settingsDao().saveSettings(dogs);
        });
    }


}


