package com.example.vedkrishi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vedkrishi.Season.KharifActivity;
import com.example.vedkrishi.Season.RabiActivity;
import com.example.vedkrishi.Season.ZaidActivity;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private Context _context;
    private List<Post> posts;
    private String[] name;
    private int[] image;

//    public RecyclerAdapter(List<Post> posts){
//
//        this.context = context;
//        this.posts = posts;
//    }

    public RecyclerAdapter(String[] name, int[] image,Context context) {
        this.name=name;
        this.image=image;
        _context=context;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fragment_home_item,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        final String title=name[position];
        holder.image.setBackgroundResource(image[position]);
        holder.name.setText(title);
        holder.mview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startactivity(holder.name.getText().toString());
            }
        });
    }

    private void startactivity(String name) {
        if(name.equals("Kharif")){
            Intent intent=new Intent(_context, KharifActivity.class);
            _context.startActivity(intent);
        }else if(name.equals("Rabi")){
            Intent intent=new Intent(_context, RabiActivity.class);
        }else if(name.equals("Zaid")){
            Intent intent=new Intent(_context, ZaidActivity.class);
        }
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView name;
        public View mview;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            mview= itemView;
            image=itemView.findViewById(R.id.img_home);
            name=itemView.findViewById(R.id.txt_name);

        }
    }

}
