package com.example.petadoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petadoption.models.AdoptionsModel;
import com.example.petadoption.viewmodel.AdoptionsViewModel;

import java.util.ArrayList;
import java.util.List;

public class Adoptions extends AppCompatActivity {
    //petsData matchesData;
    View v;
    RecyclerView recycler;
    //ArrayList<petsData> contacts;
    public ArrayList pets=new ArrayList();
    public AdoptionsViewModel aViewModel=new AdoptionsViewModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adoptions);
        // Lookup the recyclerview in activity layout
        //RecyclerView rvContacts = (RecyclerView) findViewById(R.id.recycler_view);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2 ));

        //List<petsData> matchesDataList = new ArrayList<>();

        /*matchesData = new petsData(R.drawable. dog1,"Pele");
        matchesDataList.add(matchesData);
        matchesData = new petsData(R.drawable.dog2, "lionel Messi");
        matchesDataList.add(matchesData);
        matchesData = new petsData(R.drawable.dog3, "Ronaldo");
        matchesDataList.add(matchesData);*/

        AdotionsRecyclerViewAdapter adapter = new AdotionsRecyclerViewAdapter(pets);
        recyclerView.setAdapter(adapter);

        aViewModel.getpets(
                (ArrayList<AdoptionsModel> p)->{
                    adapter.setpets(p);
                    adapter.notifyDataSetChanged();
                }
        );


    }
    @Override
    public void onPause() {
        aViewModel.clear();
        super.onPause();
    }

    public void goToPost(View view) {
        Intent intent = new Intent(this, NewPostActivity.class);
        startActivity(intent);
    }

}

