package com.example.petadoption.datamodel;

import com.example.petadoption.models.AdoptionsModel;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class AdoptionsDataModel {
    private FirebaseFirestore databaseb;
    private List<ListenerRegistration> listeners;


    public  AdoptionsDataModel(){
        databaseb = FirebaseFirestore.getInstance();
        listeners = new ArrayList<>();
    }
    public void addpets(AdoptionsModel pets) {
        CollectionReference todoItemsRef = databaseb.collection("dogs");
        todoItemsRef.add(pets);
    }

    public void getMatche(Consumer<QuerySnapshot> dataChangedCallback, Consumer<FirebaseFirestoreException> dataErrorCallback){
        ListenerRegistration listener = databaseb.collection("dogs")
                .addSnapshotListener((queryDocumentSnapshots, e) -> {
                    if(e !=null){
                        dataErrorCallback.accept(e);
                    }

                    dataChangedCallback.accept(queryDocumentSnapshots);
                });
        listeners.add(listener);
    }
    public void updatepets(AdoptionsModel pets) {
        DocumentReference dogsref = databaseb.collection("dogs").document(pets.uid);

        Map<String, Object> info = new HashMap<>();
        info.put("name", pets.name);
        info.put("imageURL", pets.imageURL);
        //info.put("liked", matches.liked);
        info.put("breed",pets.breed);
        info.put("age",pets.age);
        info.put("description",pets.breed);
        info.put("city",pets.peteLoc);

        dogsref.update(info);
    }
    public void clear() {
        listeners.forEach(ListenerRegistration::remove);
    }
}
