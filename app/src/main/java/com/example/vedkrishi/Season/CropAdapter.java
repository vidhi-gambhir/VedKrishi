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
import com.example.vedkrishi.RecyclerAdapter;
import com.example.vedkrishi.Season.KharifCrops.RiceActivity;

public class CropAdapter extends RecyclerView.Adapter<CropAdapter.CropViewHolder>{
    private Context _context;
    private String[] name;
    private String crop="";
    private int[] image;
    private String[] desc;

    public CropAdapter(int[] image, String[] name, String[] desc,Context context) {
        this.image=image;
        this.name=name;
        this.desc=desc;
        _context=context;
    }

    @NonNull
    @Override
    public CropAdapter.CropViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.kharif_crops_item,parent,false);
        return new CropAdapter.CropViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CropAdapter.CropViewHolder holder, int position) {
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

        else if(name.equals("Wheat")){
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

        else if(name.equals("Bitter Ground")){
            Intent intent=new Intent(_context, RiceActivity.class);
            crop="Bitter Ground";
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
        }
    }


    @Override
    public int getItemCount() {
        return name.length;
    }

    public class CropViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        private TextView desc;
        public View mview;
        public CropViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
            image=itemView.findViewById(R.id.img_crop);
            name=itemView.findViewById(R.id.txt_name_crop);
            desc=itemView.findViewById(R.id.txt_crop_desc);
        }
    }
}
