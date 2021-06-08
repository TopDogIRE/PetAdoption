package com.example.petadoption.datamodel;

import com.example.petadoption.models.DogsObj;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class DogModel {
    private FirebaseFirestore db;
    private List<ListenerRegistration> listeners;

    public DogModel() {
        db = FirebaseFirestore.getInstance();
        listeners = new ArrayList<>();
    }


    public void updateMatchById(DogsObj m) {
        DocumentReference todoItemRef = db.collection("matches").document(m.uid);
        Map<String, Object> data = new HashMap<>();
        data.put("name", m.dogName);
        data.put("age", m.dogAge);
        data.put("breed", m.dogBreed);
        data.put("city", m.dogLoc);
        data.put("gender", m.dogGender);
        data.put("description", m.dogDescription);
        data.put("imageURL", m.imageURL);
        data.put("age", m.dogAge);

        todoItemRef.update(data);
    }

    public void clear() {
        listeners.forEach(ListenerRegistration::remove);
    }

    public void getDogs(Consumer<QuerySnapshot> dataChangedCallback, Consumer<FirebaseFirestoreException> dataErrorCallback) {
        ListenerRegistration listener = db.collection("dogs")
                .addSnapshotListener((queryDocumentSnapshots, e) -> {
                    if (e != null) {
                        dataErrorCallback.accept(e);
                    }

                    dataChangedCallback.accept(queryDocumentSnapshots);
                });
        listeners.add(listener);
    }
}