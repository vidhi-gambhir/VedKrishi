package com.example.vedkrishi.Season;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vedkrishi.R;

public class RabiActivity extends AppCompatActivity {
    CardView cardView;
    RecyclerView recyclerView;
    TextView crop_name,crop_desc;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabi);

        cardView=findViewById(R.id.cardView);
        crop_name=findViewById(R.id.txt_name_crop);
        crop_desc=findViewById(R.id.txt_crop_desc);
        image=findViewById(R.id.img_crop);
        recyclerView=findViewById(R.id.recycle_rabi);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] name={"Wheat","Mustard","Bajra","Oat","Peas","Masoor","Moong","Carrot","Raddish","Cauliflower"};
        int[] image={R.drawable.wheat,R.drawable.mustardjpeg,R.drawable.bajra,R.drawable.oat,R.drawable.peas,R.drawable.masoor,R.drawable.moong,R.drawable.caroot,R.drawable.radish,R.drawable.cauliflower};
        String[] desc={"bbjhbj","bvhmbjhb","bmjhbjb","hhkuh","jghj","gjhvjgv","gjjhgbjh","sff","sdfsdf","dfsd"};

        recyclerView.setAdapter(new RabiAdapter(image,name,getApplicationContext()));
    }
}