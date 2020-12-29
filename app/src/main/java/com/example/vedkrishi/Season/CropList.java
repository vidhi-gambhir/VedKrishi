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
            String[] name={"Rice","Wheat"};
            int[] img={R.drawable.rice,R.drawable.wheat};
            String[] desc={"bbhjhbn","gyffgfjh"};
            recyclerView.setAdapter(new CropAdapter(img,name,desc,getApplicationContext()));
        }
        else if(state.equals("Uttar Pradesh")){
            String[] name={"Wheat","Rice","Sugarcane","MuskMelon","Bitter Gourd","Bajra"};
            int[] img={R.drawable.wheat,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice,R.drawable.rice};
            String[] desc={"wefsafd","sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"};
            recyclerView.setAdapter(new CropAdapter(img,name,desc,getApplicationContext()));

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