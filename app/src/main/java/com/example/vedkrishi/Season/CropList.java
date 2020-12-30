package com.example.vedkrishi.Season;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vedkrishi.R;

public class CropList extends AppCompatActivity {
    CardView cardView;
    RecyclerView recyclerView;
    TextView crop_name,crop_desc;
    ImageView image;
    String state="";
    String[] name={},desc={};
    int[] img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_list);

        RecyclerView recyclerView=findViewById(R.id.recycle_crop_list);
        cardView=findViewById(R.id.cardView);
        crop_name=findViewById(R.id.txt_name_crop);
        crop_desc=findViewById(R.id.txt_crop_desc);
        image=findViewById(R.id.img_crop);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        state=getIntent().getStringExtra("state");
        if(state.equals("Punjab")){
            String[] name={"Rice","Wheat","Cotton","Sugarcane","Maize","Bajra"};
            int[] img={R.drawable.rice,R.drawable.wheat,R.drawable.cotton,R.drawable.sugarcane,R.drawable.maize,R.drawable.bajra};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));
        }
        else if(state.equals("Uttar Pradesh")){
            String[] name={"Wheat","Rice","Sugarcane","MuskMelon","Bitter Gourd","Bajra","Oilseeds","Sugarcane"};
            int[] img={R.drawable.wheat,R.drawable.rice,R.drawable.sugarcane,R.drawable.muskmelon,R.drawable.bittergourd,R.drawable.bajra,R.drawable.oilseeds,R.drawable.sugarcane};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Haryana")){
            String[] name={"Wheat","Rice","Sugarcane","Cotton","Maize","Bajra"};
            int[] img={R.drawable.wheat,R.drawable.rice,R.drawable.sugarcane,R.drawable.cotton,R.drawable.maize,R.drawable.bajra};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Madhya Pradesh")){
            String[] name={"Wheat","Maize","Moong","Sugarcane","Bajra","Cotton"};
            int[] img={R.drawable.wheat,R.drawable.maize,R.drawable.moong,R.drawable.sugarcane,R.drawable.bajra,R.drawable.cotton};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Maharashtra")){
            String[] name={"Wheat","Rice","Sugarcane","Oilseeds","Bitter Gourd","Bajra"};
            int[] img={R.drawable.wheat,R.drawable.rice,R.drawable.sugarcane,R.drawable.oilseeds,R.drawable.bittergourd,R.drawable.bajra};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Gujarat")){
            String[] name={"Wheat","Pumpkin","Cotton","Maize","Mustard","Bajra"};
            int[] img={R.drawable.wheat,R.drawable.pumpkin,R.drawable.cotton,R.drawable.maize,R.drawable.mustardjpeg,R.drawable.bajra};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Assam")){
            String[] name={"Wheat","Jute","Sugarcane","Maize","Oat","Tea"};
            int[] img={R.drawable.wheat,R.drawable.jute,R.drawable.sugarcane,R.drawable.maize,R.drawable.oat,R.drawable.tea};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("West Bengal")){
            String[] name={"Oilseeds","Rice","Sugarcane","Jute","Tea"};
            int[] img={R.drawable.oilseeds,R.drawable.rice,R.drawable.sugarcane,R.drawable.jute,R.drawable.tea};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Karnataka")){
            String[] name={"Cotton","Rice","Sugarcane","Coffee","Maize","Oilseeds"};
            int[] img={R.drawable.cotton,R.drawable.rice,R.drawable.sugarcane,R.drawable.coffee,R.drawable.maize,R.drawable.oilseeds};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Tamil Nadu")){
            String[] name={"Cotton","Rice","Sugarcane","Maize","Tea","Bajra"};
            int[] img={R.drawable.cotton,R.drawable.rice,R.drawable.sugarcane,R.drawable.maize,R.drawable.tea,R.drawable.bajra};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Kerala")){
            String[] name={"Coconut","Rice","Coffee","Tea","Oilseeds","Pepper"};
            int[] img={R.drawable.coconut,R.drawable.rice,R.drawable.coffee,R.drawable.tea,R.drawable.oilseeds,R.drawable.pepper};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Andhra Pradesh")){
            String[] name={"Maize","Cotton","Sugarcane","Moong","Rice","Masoor"};
            int[] img={R.drawable.maize,R.drawable.cotton,R.drawable.sugarcane,R.drawable.moong,R.drawable.rice,R.drawable.masoor};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Odisha")){
            String[] name={"Moong","Rice","Oilseeds","Jute","Coconut","Tea"};
            int[] img={R.drawable.moong,R.drawable.rice,R.drawable.oilseeds,R.drawable.jute,R.drawable.coconut,R.drawable.tea};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }else if(state.equals("Bihar")){
            String[] name={"Wheat","Maize","Moong","Sugarcane","Jute","Oilseeds"};
            int[] img={R.drawable.wheat,R.drawable.maize,R.drawable.moong,R.drawable.sugarcane,R.drawable.jute,R.drawable.oilseeds};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,getApplicationContext()));

        }


//        String[] name={"wheat","Cotton","Maize", "Oilseeds", "Tea",
//                "Coffee", "Rice", "Basmati Rice", "Soyabean", "Sorghum",
//                "Jowar", "Millet", "Turmeric", "Groundnut", "Sugarcane",
//                "Green Gram(Moong)", "Seasome(Till)", "Arhar(Toor)", "Black Gram(Urad)",
//                "Rubber", "Mustard", "Barley", "Peas", "Oats", "Creals",
//                "Linseeds", "Watermelon", "Cucumber", "Muskmelon", "Bitter Gourd",
//                "Pumpkin", "Jute", "Tobacco", "Coconut", "Paddy", "Grams",
//                "Bajra", "Pulses", "Lentil(Rabi)", "Flax", "Oil palm", "Clove",
//                "Black Pepper", "Cradamom", "Chicken pea", "Green chilli",
//                "Coriander", "Tomatos", "Onions", "Potatoes", "Ladyfinger",
//                "Sun flower seeds", "Bottle gourds", "Water chestnuts", "Peanuts",
//                "Corn", "Cauliflower", "Brinjal", "Mushroom plantation", "Melons", "Rajma"};


//        int[] image={R.drawable.rice,R.drawable.cotton,R.drawable.maize,R.drawable.oilseeds,R.drawable.tea,R.drawable.coffee,R.drawable.sugarcane,
//                R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,
//                R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,
//                R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice, R.drawable.rice,
//                R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,
//                R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,
//                R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,
//                R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,};
//
//
//        String[] desc={"bbjhbj","bvhmbjhb","bmjhbjb","hhkuh","jghj","gjhvjgv","gjjhgbjh",
//                "jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj",
//                "jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj",
//                "jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj",
//                "jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj",
//                "jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj",
//                "jghj","jghj","jghj","jghj"};

    }
}