package com.example.petadoption.viewmodel;

import com.example.petadoption.datamodel.AdoptionsDataModel;
import com.example.petadoption.models.AdoptionsModel;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.function.Consumer;

public class AdoptionsViewModel {
    private AdoptionsDataModel matchesDataM;

    public AdoptionsViewModel(){
        matchesDataM = new AdoptionsDataModel();
    }
    public void addpets(AdoptionsModel pets){
        matchesDataM.addpets(pets);
    }

    public void getpets(Consumer<ArrayList<AdoptionsModel>> responseCallback){
        matchesDataM.getMatche(
                (QuerySnapshot querySnapshot) ->{
                    if(querySnapshot != null){
                        ArrayList<AdoptionsModel> matchViews = new ArrayList<>();
                        for (DocumentSnapshot matchesSnap : querySnapshot.getDocuments()){
                            AdoptionsModel petsModel = matchesSnap.toObject(AdoptionsModel.class);
                            assert  petsModel !=null;
                            petsModel.uid =matchesSnap.getId();
                            matchViews.add( petsModel);
                        }
                        responseCallback.accept(matchViews);
                    }
                },
                (databaseError -> System.out.println("Error something went wrong" + databaseError))
        );
    }
    public void updateMatch(AdoptionsModel m){
        matchesDataM.updatepets(m);
    }
    public void clear(){
        matchesDataM.clear();
    }

}
