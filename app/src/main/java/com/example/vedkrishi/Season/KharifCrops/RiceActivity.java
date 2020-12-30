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
        } else if(crop.equals("Maize")){
            title.setText("Maize");
            desc.setText("In India, maize is the third most important food crops after rice and wheat. According to advance estimate its production is likely to be 22.23 M Tonnes (2012-13) mainly during Kharif season which covers 80% area. Maize in India, contributes nearly 9 % in the national food basket.");
            lifeSpan.setText("3-4 months");
            soil.setText("Loamy sand, clay loam");
            sow.setText("June-July");
            harvest.setText("Sep-Oct");
            region.setText("Andhra Pradesh, Karnataka, Rajasthan, Maharashtra, Bihar, Uttar Pradesh, Madhya Pradesh, Himachal Pradesh");
            temp.setText("15-27 c");
            rain.setText("65-125 cm");
            ferti.setText("Nitrogen");
            pesti.setText("Carbofuran");
            image.setImageResource(R.drawable.maize);
        } else if(crop.equals("Oilseeds")){
            title.setText("Oilseeds");
            desc.setText("Among the nine oilseed crops grown in the country, seven are of edible oils (soybean, groundnut, rapeseed-mustard, sunflower, sesame, safflower and niger) and two are of non-edible oils (castor and linseed). India ranks first in the production of most of the minor oilseeds (castor, niger, safflower and sesame).");
            lifeSpan.setText("5-6 months");
            soil.setText("sandy loams, loams, red, yellow and black cotton soils");
            sow.setText("June-July");
            harvest.setText("Oct-Nov");
            region.setText("MP,Rajisthan,Gujrat,Maharashtra");
            temp.setText("20-30 c");
            rain.setText("50-75 cm");
            ferti.setText("FYM, Nitrogen");
            pesti.setText("Neonicotinoide");
            image.setImageResource(R.drawable.oilseeds);
        } else if(crop.equals("Tea")){
            title.setText("Tea");
            desc.setText("Tea production, cultivation of the tea plant, usually done in large commercial operations. The plant, a species of evergeen (Camellia sinensis), is valued for its young leaves and leaf buds, from which the tea beverage is produced.");
            lifeSpan.setText("5-6 months");
            soil.setText("Loam");
            sow.setText("June-July");
            harvest.setText("Oct-Dec");
            region.setText("Assam,West Bengal");
            temp.setText("20-30 c");
            rain.setText("150-300 cm");
            ferti.setText("Ammonium Sulphate");
            pesti.setText("Flubendiamide, Emamectin Benzoate");
            image.setImageResource(R.drawable.tea);
        } else if(crop.equals("Sugarcane")){
            title.setText("Sugarcane");
            desc.setText("Sugarcane is an important cash crop. India stands at 2nd position among all countries in the world in its production.");
            lifeSpan.setText("7-8 months");
            soil.setText("Loam");
            sow.setText("Subtropical-'September-October & February-March', ");
            harvest.setText("10-18 months stage, after planting");
            region.setText("Uttar Pradesh,Andra Pradesh, Bihar, Maharastra, Karnataka");
            temp.setText("20-26 c");
            rain.setText("75-150 cm");
            ferti.setText("azospirillum, phosphobacteria");
            pesti.setText("Ametryn, MSMA, MCPA");
            image.setImageResource(R.drawable.sugarcane);
        } else if(crop.equals("Coffee")){
            title.setText("Coffee");
            desc.setText("Indian coffee is said to be the finest coffee grown in the shade rather than direct sunlight anywhere in the world.[1] There are about 250,000 coffee growers in the country; 98% of them are small growers.[2] As of 2009, Indian coffee made up just 4.5% of the global production. Almost 80% of Indian coffee is exported;[3] 70% is bound for Germany, Russia, Spain, Belgium, Slovenia, United States, Japan, Greece, Netherlands and France.");
            lifeSpan.setText("50-60 years");
            soil.setText("Deep, fertile, rich in organic matter, well drained and slightly acidic (Ph6.0-6.5)");
            sow.setText("December-January");
            harvest.setText("February-March");
            region.setText("Karnataka, Kerala, Tamil Nadu");
            temp.setText("23-28 C");
            rain.setText("150-200 cm");
            ferti.setText("Well-composted Organic manure");
            pesti.setText("Chlorpyrifos, Endosulpan, Methylparathion");
            image.setImageResource(R.drawable.coffee);
        } else if(crop.equals("Bitter guard")){
            title.setText("Bitter guard");
            desc.setText("Bitter gourd (Momordica charantia) is an important vegetable crop and is grown for its immature tuberculate fruits which have a unique bitter taste. It is tropical vine that belongs to a gourd family.");
            lifeSpan.setText("110-130 days");
            soil.setText("Sandy Loam");
            sow.setText("Feb-March or june-july");
            harvest.setText("12 to 16 weeks after planting.");
            region.setText("Uttar Pradesh,Andra Pradesh, Bihar, Maharastra, Karnataka, Telangana, Maharastra");
            temp.setText("24-27 c");
            rain.setText("50-70 cm");
            ferti.setText("Urea,SSP,Muriate of potash");
            pesti.setText("Rotenon, Pyrethrum based insecticides.");
            image.setImageResource(R.drawable.bitterguard);
        }
         else if(crop.equals("jute")){
            title.setText("Jute");
            desc.setText("Jute is a tropical plant that requires hot and humid climate. It is one of the most
important natural fibres in terms of cultivation and usage. Almost 85% of the world's
jute is cultivated in the Ganges Delta.");
            lifeSpan.setText("180-360 days");
            soil.setText("Sandy and Clay loam");
            sow.setText("March-April");
            harvest.setText("June to september");
            region.setText("West Bengal, Bihar, Assam,Andhra Pradesh, Orissa, Meghalaya,Nagaland, Tripura, Uttar Pradesh");
            temp.setText("24-35 °C");
            rain.setText("125-200 cm");
            ferti.setText("Urea,D.A.P and T.S.P");
            pesti.setText("Endosulfan and fenpropathrin");
            image.setImageResource(R.drawable.jute);
        }
         else if(crop.equals("Pumpkin")){
            title.setText("Pumpkin");
            desc.setText("India is the second largest producer of pumpkin");
            lifeSpan.setText("3-4 months");
            soil.setText("Loamy");
            sow.setText("January or September");
            harvest.setText("3 months after planting");
            region.setText("Uttar Pradesh,Orissa,Madhya pradesh,Chattisgarh");
            temp.setText("25-28 °C");
            rain.setText("20-30 cm");
            ferti.setText("Nitrogen,phosphorus,potassium");
            pesti.setText("Benevia [Cyantraniliprole] ,Acetamipride ");
            image.setImageResource(R.drawable.pumpkin);
        }
         else if(crop.equals("Cucumber")){
            title.setText("Cucumber");
            desc.setText("Cucumber is a widely-cultivated creeping vine plant in the Cucurbitaceae gourd family that bears cucumiform fruits, which are used as vegetables");
            lifeSpan.setText("70 days");
            soil.setText("Sandy Loamy");
            sow.setText("Feb-March");
            harvest.setText("May-June");
            region.setText("Haryana,Madhya pradesh,Andhra pradesh,Karnataka");
            temp.setText("25-35 °C");
            rain.setText("120-150 cm");
            ferti.setText("Urea,SSP,MOP");
            pesti.setText(" Immidachloprid-17.8%SL @7ml in 10ltr of water ");
            image.setImageResource(R.drawable.cucumber);
        }
         else if(crop.equals("Muskmelon")){
            title.setText("Muskmelon");
            desc.setText("Muskmelon is a round melon with firm, orange, moderately-sweet flesh and a thin reticulated light-brown rind.");
            lifeSpan.setText("35-45 days");
            soil.setText("Sandy Loamy");
            sow.setText("November-February");
            harvest.setText("70-100 days after sowing.");
            region.setText("Punjab, Tamil Nadu, Uttar Pradesh, Maharashtra, and Andhra Pradesh");
            temp.setText("18-30°C");
            rain.setText("50-75 mm");
            ferti.setText("Apply FYM 20 t/ha, NPK 40:60:30 kg/ha as basal and N @ 40 kg/ha 30 days after sowing");
            pesti.setText(" Abamectin@6ml/15Ltr of water, Thiamethoxam@5gm/15Ltr of water ");
            image.setImageResource(R.drawable.muskmelon);
        }
         else if(crop.equals("Watermelon")){
            title.setText("Watermelon");
            desc.setText(Watermelon is a flowering plant species of the Cucurbitaceae family.It is a highly cultivated fruit worldwide, with more than 1,000 varieties.");
            lifeSpan.setText("3-4 months");
            soil.setText("Sandy, Sandy Loamy");
            sow.setText("Jan-March");
            harvest.setText("120 days after sowing.");
            region.setText("Maharashtra, Karnataka, Tamil Nadu, Punjab, Rajasthan, Madhya Pradesh, and Uttar Pradesh");
            temp.setText("20-30°C");
            rain.setText("50-75 mm");
            ferti.setText(" Nitrogen, Urea, SSP, MOP");
            pesti.setText(" Carbendazim@400gm/200liter of water, Copper Oxychloride@400gm/200liter ");
            image.setImageResource(R.drawable.watermelon);
        }

    }
}