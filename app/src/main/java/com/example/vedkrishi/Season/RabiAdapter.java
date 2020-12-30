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

public class RabiAdapter extends RecyclerView.Adapter<RabiAdapter.RabiViewHolder> {
    private Context _context;
    private String[] name;
    private String crop="";
    private int[] image;
    private String[] desc;

    public RabiAdapter(int[] image, String[] name,Context context) {
        this.image=image;
        this.name=name;
        _context=context;
    }

    @NonNull
    @Override
    public RabiAdapter.RabiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.kharif_crops_item,parent,false);
        return new RabiAdapter.RabiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RabiAdapter.RabiViewHolder holder, int position) {
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
        if(name.equals("Wheat")){
            Intent intent=new Intent(_context, RiceActivity.class);
            crop="Wheat";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Maize")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Maize";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Mustard")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Mustard";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Bajra")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Bajra";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Oat")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Oat";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Peas")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Peas";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Chickenpeas")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Chickenpeas";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Masoor")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Masoor";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Moong")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Moong";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Carrot")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Carrot";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Raddish")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Raddish";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Cauliflower")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Cauliflower";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }
    }


    @Override
    public int getItemCount() {
        return name.length;
    }

    public class RabiViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        public View mview;
        public RabiViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
            image=itemView.findViewById(R.id.img_crop);
            name=itemView.findViewById(R.id.txt_name_crop);
        }
    }
}
