package com.example.xook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AprendeFragment extends Fragment{


    private RecyclerView recyclerView;
    private ArrayList<PalabraModel> imageModelArrayList;
    private PalabraAdapter adapter;

    private int[] myImageList = new int[]{R.drawable.apple,R.drawable.mango,R.drawable.straw,R.drawable.pineapple,R.drawable.orange,R.drawable.blue,R.drawable.water};
    private String[] myImageNameList = new String[]{"Manzana","Mango","Fresa","Piña","Naranja","Mora","Sandía"};
    private int[] myAudioList = new int[]{R.raw.manzana,R.raw.mango,R.raw.fresa,R.raw.pina,R.raw.naranja,R.raw.mora,R.raw.sandia};
    private int[] sMyAudioList = new int[]{R.raw.s_manzana,R.raw.s_mango,R.raw.s_fresa,R.raw.s_pina,R.raw.s_naranja,R.raw.s_mora,R.raw.s_sandia};

    public AprendeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.fragment_aprende, container, false);



        recyclerView =  RootView.findViewById(R.id.recycler);

        imageModelArrayList = palabras();
        adapter = new PalabraAdapter(getContext(), imageModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        // Inflate the layout for this fragment
        return RootView;
    }

    private ArrayList<PalabraModel> palabras(){

        ArrayList<PalabraModel> list = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            PalabraModel palabraModel = new PalabraModel();
            palabraModel.setName(myImageNameList[i]);
            palabraModel.setImage_drawable(myImageList[i]);
            palabraModel.setAudioResourceId(myAudioList[i]);
            palabraModel.setSlowAudioResourceId(sMyAudioList[i]);
            list.add(palabraModel);
        }

        return list;
    }

}

