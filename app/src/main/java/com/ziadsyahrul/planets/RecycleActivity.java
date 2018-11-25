package com.ziadsyahrul.planets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    //TODO 1 mengenerate butterknife untuk recycleview
    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    //TODO 2 membuat variable array untuk menampung data nama,detail dan gambar dari String Array pada
    String[] namaPlanet;
    String[] detailPlanet;
    int[] gambarPlanet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        //TODO 3 Mengisi variable array dari folder -> Strings,drawable
        namaPlanet = getResources().getStringArray(R.array.planets_name);
        detailPlanet = getResources().getStringArray(R.array.planets_detail);
        gambarPlanet = new int[]{R.drawable.merkurius,R.drawable.venus,R.drawable.bumi, R.drawable.mars,R.drawable.jupiter,R.drawable.saturnus,R.drawable.uranus  ,R.drawable.neptunus,R.drawable.pluto};

        //TODO 4 Membuat object adpater dan mengirim data nama,detail dan gambar ke adapter
        Adapter adapter = new Adapter(RecycleActivity.this, gambarPlanet, namaPlanet, detailPlanet);
        //TODO 5 Mensetting recyclerview dan mengeset recycleview dengan adapter
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}