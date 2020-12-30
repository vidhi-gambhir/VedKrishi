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

public class KharifAdapter extends RecyclerView.Adapter<KharifAdapter.KharifViewHolder> {
    private Context _context;
    private String[] name;
    private String crop="";
    private int[] image;
    private String[] desc;

    public KharifAdapter(int[] image, String[] name,Context context) {
        this.image=image;
        this.name=name;
        _context=context;
    }

    @NonNull
    @Override
    public KharifViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.kharif_crops_item,parent,false);
        return new KharifAdapter.KharifViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KharifViewHolder holder, int position) {
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
        if(name.equals("Rice")){
            Intent intent=new Intent(_context, RiceActivity.class);
            crop="Rice";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Cotton")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Cotton";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Maize")){
            Intent intent=new Intent(_context,RiceActivity.class);
            crop="Maize";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Oilseeds")){
            Intent intent=new Intent(_context, RiceActivity.class);
            crop="Oilseeds";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Tea")){
            Intent intent=new Intent(_context, RiceActivity.class);
            crop="Tea";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Coffee")){
            Intent intent=new Intent(_context, RiceActivity.class);
            crop="Coffee";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }else if(name.equals("Sugarcane")){
            Intent intent=new Intent(_context, RiceActivity.class);
            crop="Sugarcane";
            intent.putExtra("crop",crop);
            _context.startActivity(intent);
        }
    }


    @Override
    public int getItemCount() {
        return name.length;
    }

    public class KharifViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        public View mview;
        public KharifViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
            image=itemView.findViewById(R.id.img_crop);
            name=itemView.findViewById(R.id.txt_name_crop);
        }
    }
}
