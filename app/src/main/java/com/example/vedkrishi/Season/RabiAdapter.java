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

    public RabiAdapter(int[] image, String[] name, String[] desc,Context context) {
        this.image=image;
        this.name=name;
        this.desc=desc;
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
        final String Desc=desc[position];
        holder.image.setBackgroundResource(image[position]);
        holder.name.setText(title);
        holder.desc.setText(Desc);
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
        }
    }


    @Override
    public int getItemCount() {
        return name.length;
    }

    public class RabiViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        private TextView desc;
        public View mview;
        public RabiViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
            image=itemView.findViewById(R.id.img_crop);
            name=itemView.findViewById(R.id.txt_name_crop);
            desc=itemView.findViewById(R.id.txt_crop_desc);
        }
    }
}
