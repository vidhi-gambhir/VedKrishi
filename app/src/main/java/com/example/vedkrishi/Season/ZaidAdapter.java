package com.example.vedkrishi.Season;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vedkrishi.R;
import com.example.vedkrishi.Season.KharifCrops.RiceActivity;

public class ZaidAdapter extends RecyclerView.Adapter<ZaidAdapter.ZaidViewHolder> {
    private Context _context;
    private String[] name;
    private String crop="";
    private int[] image;
    private String[] desc;

    public ZaidAdapter(int[] image, String[] name,Context context) {
        this.image=image;
        this.name=name;
        _context=context;
    }

    @NonNull
    @Override
    public ZaidAdapter.ZaidViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.kharif_crops_item,parent,false);
        return new ZaidAdapter.ZaidViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ZaidAdapter.ZaidViewHolder holder, int position) {
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
        if(name.equals("Bitter Gourd")){
            Intent intent=new Intent(_context, RiceActivity.class);
            crop="Bitter Gourd";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Pumpkin")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Pumpkin";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Jute")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Jute";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Cucumber")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Cucumber";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Muskmelon")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Muskmelon";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Watermelon")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Watermelon";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }
    }


    @Override
    public int getItemCount() {
        return name.length;
    }

    public class ZaidViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        public View mview;
        public ZaidViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
            image=itemView.findViewById(R.id.img_crop);
            name=itemView.findViewById(R.id.txt_name_crop);
        }
    }
}
