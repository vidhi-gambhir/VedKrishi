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
            sow.setText("Subtropical-'Sept-Oct & Feb-March' ");
            harvest.setText("10-18 months after planting");
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
        }else if (crop.equals("Wheat")) {
            title.setText("Wheat");
            desc.setText("Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food.");
            lifeSpan.setText("4-6 months");
            soil.setText("Loam");
            sow.setText("Oct-Dec");
            harvest.setText("Feb-May");
            region.setText("Uttar Pradesh, Punjab, Haryana, Madhya Pradesh, Rajasthan, Bihar and Gujarat");
            temp.setText("17-20 c");
            rain.setText("75 cm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Imidachloride 17.8");
            image.setImageResource(R.drawable.wheat);

        } else if (crop.equals("Mustard")) {
            title.setText("Mustard");
            desc.setText("\"Mustard (Brassica spp.), a native to temperate regions of Europe, was one of the first domesticated crops. This crop’s economic value resulted in its wide dispersal and it has been grown as a herb in Asia, North Africa, and Europe for thousands of years. Mustard has been cultivated as early as 5000 BC.\n" +
                    "\n" +
                    "Brassica (rapeseed‐mustard) is the second most important edible oilseed crop in India after groundnut and accounts for nearly 30% of the total oilseeds produced in the country. India is one of the largest rapeseed‐mustard growing countries in the world, accounting for 21.7 % and 10.7% of the total acreage and production occupying the first position in Area and second position in Production after China. The most important states growing these crops are Uttar Pradesh, Rajasthan, Madhya Pradesh, Haryana, Punjab, Orissa, Assam, Bihar, Gujarat and West Bengal. The world production of Rapeseed/Mustard has been increasing at a rapid rate in several countries largely in response to the continuing increase in demand for edible oils and its products.");
            lifeSpan.setText("3-4 months");
            soil.setText("Loam");
            sow.setText("Oct-Dec");
            harvest.setText("Feb-May");
            region.setText("Uttar Pradesh, Punjab, Haryana, Madhya Pradesh, Rajasthan, Bihar and Gujarat");
            temp.setText("15-20 c");
            rain.setText("75-100 cm");
            ferti.setText("Nitrogen,Potasm");
            pesti.setText("spinosad,bifenthrin");
            image.setImageResource(R.drawable.mustardjpeg);


        } else if (crop.equals("Bajra")) {
            title.setText("Bajra");
            desc.setText("Bajra popularly known as Pearl millet, cattail millet or bulrush belongs to the family Graminea. The crop is cultivated for grain as well as for fodder in the arid region of Africa and Asia and as a pasture in U.S.A. It is originated in India or Africa. It is grown all over India except Assam and part of northeast India.");
            lifeSpan.setText("3-4 months");
            soil.setText("loam");
            sow.setText("july-aug");
            harvest.setText("nov-march");
            region.setText("Andhra Pradesh, Madhya Pradesh, Gujarat, Maharashtra");
            temp.setText("17-25 c");
            rain.setText("40-50 cm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Eldrin 20 c.c");
            image.setImageResource(R.drawable.bajra);

        } else if (crop.equals("Oat")) {
            title.setText("Oat");
            desc.setText("Oats area and production in the World are about 27m ha and 40m tones, respectively. ... In India, Punjab, Haryana, UP and limited areas in MP, Orissa, Bihar, West Bengal are the Oats growing states.");
            lifeSpan.setText("3-4 months");
            soil.setText("loamy soil");
            sow.setText("nov-dec");
            harvest.setText("april-may");
            region.setText("punjab,haryana,mp,bihar,odisa");
            temp.setText("17-25 c");
            rain.setText("50-75 cm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");

            image.setImageResource(R.drawable.oat);
        } else if (crop.equals("Peas")) {
            title.setText("Peas");
            desc.setText(" is a cool season crop grown throughout the world. Green pods are used for vegetable purpose and dried peas are used as pulse");
            lifeSpan.setText("1-2 months");
            soil.setText("loam,fine tilth");
            sow.setText("oct-nov");
            harvest.setText("dec-jan");
            region.setText("  Himachal Pradesh, Madhya Pradesh, Rajasthan, Maharashtra, Punjab, Haryana, Karnataka and Bihar");
            temp.setText("17-25 c");
            rain.setText("50-75 cm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Dimethoate 30 EC or Phosphamidon 40 SL");
            image.setImageResource(R.drawable.peas);


        } else if (crop.equals("Chickpeas")) {
            title.setText("Chickpeas");
            desc.setText(" Chickpea varieties developed by pure line selection in India. The world's total production of chickpeas hovers around 8.5 million metric tons annually and is grown over 10 million hectares of land approximately. The Desi type chickpea contribute to around 80% and the Kabuli type around 20% of the total production.");
            lifeSpan.setText("1-2 months");
            soil.setText("heavy soils, black cotton soils, and sandy loam soils.");
            sow.setText("sept-oct");
            harvest.setText("dec-jan");
            region.setText("  Himachal Pradesh, Madhya Pradesh, Rajasthan, Maharashtra, Punjab, Haryana, Karnataka and Bihar");
            temp.setText("24-30c");
            rain.setText("65 to 95 cm");
            ferti.setText("Phosphorus,Nitrogen,diammonium phosphate ");
            pesti.setText("Thiram (1:1)");
            image.setImageResource(R.drawable.chickenpeas);
        } else if (crop.equals("Masoor")) {
            title.setText("Masoor");
            desc.setText("  It is one of the most important protein rich pulse crop. It is mostly eaten as Dal by splitting into 2 cotyledons, deep orange red or orange yellow in color. Whole grain is also used in various dishes. Lentil also provide a source of starch for textiles and printing. It is mixed with wheat flour in bread and cake production. India is the highest producer of lentil in the world.");
            lifeSpan.setText("1-2 months");
            soil.setText("heavy soils, black cotton soils, and sandy loam soils.");
            sow.setText("oct-nov");
            harvest.setText("dec-jan");
            region.setText("  mp,up,bihar");
            temp.setText("18°C - 20°C");
            rain.setText("100cm");
            ferti.setText("urea ");
            pesti.setText("Hexavin 50WP");
            image.setImageResource(R.drawable.masoor);
        } else if (crop.equals("Moong")) {
            title.setText("Moong");
            desc.setText("  Green gram also known as moong is one of the main pulse crop of India. It is a rich source of Protein along with fibre and iron. It can be cultivated as Kharif as well as summer crop");
            lifeSpan.setText("1-2 months");
            soil.setText("heavy soils, black cotton soils, and sandy loam soils.");
            sow.setText("oct-nov");
            harvest.setText("dec-jan");
            region.setText(" assam,meghalya,bihar,odisa");
            temp.setText("25°C - 35°C");
            rain.setText("60-90cm");
            ferti.setText("urea ");

            image.setImageResource(R.drawable.moong);

        } else if (crop.equals("Carrot")) {
            title.setText("Carrot");
            desc.setText("  Carrot is a cool season crop and will develop a good colour when grown at 15°C to 20°C. The crop needs deep loose loamy soil. It requires a pH ranging from 6.0 to 7.0 for higher production. Carrot can be grown throughout the year at an elevation above 1500 metres with assured irrigation.");
            lifeSpan.setText("1-2 months");
            soil.setText("heavy soils, black cotton soils, and sandy loam soils.");
            sow.setText("oct-nov");
            harvest.setText("dec-jan");
            region.setText(" assam,meghalya,bihar,odisa");
            temp.setText("15°C to 20°C");
            rain.setText("20-50cm");
            ferti.setText("urea ");

            image.setImageResource(R.drawable.caroot);


        }
        else if (crop.equals("Raddish")) {
            title.setText("Raddish");
            desc.setText(" Radish, edible root vegetable belongs to family of Cruciferae and its origin is in Mediterranean. It is crop of tropical and temperate region. It is a quick growing annual or biannual herb. Its edible roots are having different color from white to red.");
            lifeSpan.setText("1-2 months");
            soil.setText("loam,fine tilth,black soil");
            sow.setText("nov-dec");
            harvest.setText("feb-mar");
            region.setText("   West Bengal, Bihar, Uttar Pradesh, Karnataka, Punjab and Assam");
            temp.setText("17-25 c");
            rain.setText("100-225mm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Malathion 50EC");
            image.setImageResource(R.drawable.radish);
        }
        else if (crop.equals("Cauliflower")) {
            title.setText("Cauliflower");
            desc.setText(" Cauliflower is one of several vegetables in the species Brassica oleracea in the genus Brassica, which is in the Brassicaceae (or Mustard) family. ... The cauliflower head is composed of a white inflorescence meristem. Cauliflower heads resemble those in broccoli, which differs in having flower buds as the edible portion.");
            lifeSpan.setText("1-2 months");
            soil.setText("loam,fine tilth,black soil");
            sow.setText("aug-nov");
            harvest.setText("feb-mar");
            region.setText("  north,east india" );
            temp.setText("12-30°C");
            rain.setText("120-125mm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Bt formulations");
            image.setImageResource(R.drawable.cauliflower);
        }else if(crop.equals("Bitter Gourd")){
            title.setText("Bitter Gourd");
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
            image.setImageResource(R.drawable.bittergourd);
        }
        else if(crop.equals("Jute")){
            title.setText("Jute");
            desc.setText("Jute is a tropical plant that requires hot and humid climate. It is one of the most important natural fibres in terms of cultivation and usage. Almost 85% of the world's jute is cultivated in the Ganges Delta.");
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
            desc.setText("Watermelon is a flowering plant species of the Cucurbitaceae family.It is a highly cultivated fruit worldwide, with more than 1,000 varieties.");
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
        }else if (crop.equals("Coconut")){
            title.setText("Coconut");
            desc.setText("Coconut tree is a member of plam tree family.They grow upto 30m tall,with pinnate leaves 4m long.");
            lifeSpan.setText("7-8 months");
            soil.setText("alluvial,red sandy loam");
            sow.setText("May-June");
            harvest.setText("Apirl-June");
            region.setText("Kerala,Tamil Nadu,Karnataka,Goa");
            temp.setText("20-32 C");
            rain.setText("200 cm");
            ferti.setText("Urea,Phosphate,Potash");
            pesti.setText("Malathion 50 EC 2ml/lt");
            image.setImageResource(R.drawable.coconut);
        }else if (crop.equals("Pepper")){
            title.setText("Pepper");
            desc.setText("Pepper is grown mainly as a rainfedcrop.It require humidity and warm climate.");
            lifeSpan.setText("4 yrs to mature");
            soil.setText("sandy loam");
            sow.setText("May-June");
            harvest.setText("Nov-Feb");
            region.setText("Karnataka,Kerala,Tamil Nadu");
            temp.setText("24-29 C");
            rain.setText("250 cm");
            ferti.setText("Phosphorus,Nitogen");
            pesti.setText("Neem oil");
            image.setImageResource(R.drawable.pepper);
        }

    }
}