package com.example.vedkrishi.Season.KharifCrops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vedkrishi.R;

public class RiceActivity extends AppCompatActivity {
    String crop;
    TextView title,desc,lifeSpan,soil,sow,harvest,region,temp,rain,ferti,pesti;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        title=findViewById(R.id.hd_rice);
        desc=findViewById(R.id.desc_rice);
        lifeSpan=findViewById(R.id.life_rice_desc);
        soil=findViewById(R.id.soil_desc);
        sow=findViewById(R.id.sow_desc);
        harvest=findViewById(R.id.harvest_desc);
        region=findViewById(R.id.region_desc);
        temp=findViewById(R.id.temp_desc);
        rain=findViewById(R.id.rain_desc);
        ferti=findViewById(R.id.ferti_desc);
        pesti=findViewById(R.id.pesti_desc);
        image=findViewById(R.id.img_rice);

        crop=getIntent().getStringExtra("crop");

        if(crop.equals("Rice")){
            title.setText("Rice");
            desc.setText("India is one of the world's largest producers of rice");
            lifeSpan.setText("3-4 months");
            soil.setText("Loamy soil");
            sow.setText("June-July");
            harvest.setText("Nov-Dec");
            region.setText("West Bengal, Punjab ,Uttar Pradesh");
            temp.setText("24 C");
            rain.setText("150 cm");
            ferti.setText("105 pounds of nitrogen per acre preflood followed by 45 pounds of nitrogen per acre between green ring and 0.5-inch internode elongation for varieties such as Ahrent, Bengal, Cocodrie, Francis, and Wells");
            pesti.setText("Lambda-cyhalothrin, malathion and zeta-cypermethrin are all broad-spectrum pesticides used on rice.");
            image.setImageResource(R.drawable.rice);

        }else if(crop.equals("Cotton")){
            title.setText("Cotton");
            desc.setText("Cotton is one of the most important fiber and cash crop of India and plays a dominant role in the industrial and agricultural economy of the country. It provides the basic raw material (cotton fibre) to cotton textile industry.");
            lifeSpan.setText("4-5 months");
            soil.setText("alluvial, clayey and red sandy loam");
            sow.setText("April-May");
            harvest.setText("Dec-Jan");
            region.setText("Maharashtra, Gujarat, Telangana");
            temp.setText("21-30 C");
            rain.setText("50-100 cm");
            ferti.setText("Nitrogen, Phosphorus, potassium");
            pesti.setText("Endosulfan 35 EC 2.5 lit/ha");
            image.setImageResource(R.drawable.cotton);
        }

    }
}