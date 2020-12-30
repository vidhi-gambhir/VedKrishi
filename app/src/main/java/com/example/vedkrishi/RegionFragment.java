package com.example.vedkrishi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RegionFragment extends Fragment {
    RecyclerView recyclerView;
    View root;
    RegionAdapter adapter;

    public RegionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_region, container, false);
        recyclerView=root.findViewById(R.id.recycle_region);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        String[] name = {"Punjab","Uttar Pradesh","Haryana","Madhya Pradesh","Maharashtra","Gujarat","Assam","West Bengal","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Odisha","Bihar"};
        int[] image = {R.drawable.punjab,R.drawable.upjpeg,R.drawable.haryana,R.drawable.mp,R.drawable.maharashtra,R.drawable.gujarat,R.drawable.assam,R.drawable.wb,R.drawable.karnataka,R.drawable.tamilnadu,R.drawable.kerala,R.drawable.ap,R.drawable.odishajpeg,R.drawable.biharjpeg};
        recyclerView.setAdapter(new RegionAdapter(name,image,getActivity()));

        return root;
    }
}
