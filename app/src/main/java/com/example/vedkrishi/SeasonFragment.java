package com.example.vedkrishi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeasonFragment extends Fragment {
    RecyclerAdapter adapter;
    RelativeLayout tab;
    RecyclerView recyclerView;
    View root;
    String [] name={"Wheat","rice"};
    int[] image={android.R.drawable.ic_input_add,android.R.drawable.ic_input_add};


    public SeasonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root=inflater.inflate(R.layout.fragment_season, container, false);
        // Inflate the layout for this fragment
        recyclerView=root.findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        //recyclerView.setAdapter(adapter);


        String[] name = {"Kharif","Rabi","Zaid"};
        int[] image = {R.drawable.kharif,R.drawable.rabi,R.drawable.zaid};
        recyclerView.setAdapter(new RecyclerAdapter(name,image,getActivity()));
        return root;

    }


//        private ArrayList<Post> initPost() {
//            ArrayList<Post> list = new ArrayList<>();
//
//            list.add(new Post(android.R.drawable.ic_input_add,"Wheat"));
//            list.add(new Post(android.R.drawable.ic_input_add,"rice"));
//            list.add(new Post(android.R.drawable.ic_input_add,"millet"));
//            list.add(new Post(android.R.drawable.ic_input_add,"maize"));
//
//            return list;
//        }
    }

