package com.example.vedkrishi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vedkrishi.ModelClass.Main;
import com.example.vedkrishi.ModelClass.Weather;
import com.example.vedkrishi.ModelClass.WeatherResult;
import com.example.vedkrishi.Season.CropAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SuggestionFragment extends Fragment {
    TextView winfo,message,suggest;
    EditText cityName;
    Button button;
    View root;
    RecyclerView recyclerView;
    Retrofit retrofit;
    String encodeCity;
    String url="api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";
    String apikey="90f39047961a4ada796ba47c71bb92e6";


    public SuggestionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_suggestion, container, false);
        winfo=root.findViewById(R.id.textView2);
        cityName=root.findViewById(R.id.editText);
        message=root.findViewById(R.id.weather_desc);
        suggest=root.findViewById(R.id.suggest);
        recyclerView=root.findViewById(R.id.recycle_suggest);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        button=root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AuthenticationApi api=ApiClient.getClient().create(AuthenticationApi.class);

                Call<WeatherResult> weatherCall=api.getWeather(cityName.getText().toString().trim(),apikey);
                weatherCall.enqueue(new Callback<WeatherResult>() {
                    @Override
                    public void onResponse(Call<WeatherResult> call, Response<WeatherResult> response) {
                        if(response.isSuccessful()){
                            WeatherResult mydata=response.body();
                            Main main=mydata.getMain();
                            Double temp=main.getTemp();
                            int temperature=(int)(temp-273.15);
                            winfo.setText(String.valueOf(temperature)+" ℃");

                            List<Weather> weather=mydata.getWeather();
                            String desc=weather.get(0).getDescription();
                            String description=desc;
                            message.setText(description+" ");

                            //int[] image={R.drawable.rice,R.drawable.wheat,R.drawable.cotton};
                            //String [] name={"Rice","Wheat","Cotton"};
                            int[] f={18,25,22,25,25,22,24,23,28,20,21,20,26,27,30,20,18,24,30,12,17,15};
                           // String[] cropdesc={"vmbnb","jhhvmjm","ghgjb"};

                            String[] name={"Wheat","Cotton","Maize", "Oilseeds", "Tea",
                            "Coffee", "Rice", "Sugarcane",
                            "Moong", "Mustard", "Peas", "Oat","Bitter Gourd",
                            "Pumpkin", "Jute","Raddish","Carrot","Masoor",
                            "Bajra", "Chicken pea", "Cauliflower","Cucumber"};

                            int[] image={R.drawable.wheat,R.drawable.cotton,R.drawable.maize,R.drawable.oilseeds,R.drawable.tea,R.drawable.coffee,R.drawable.rice,
                R.drawable.sugarcane,R.drawable.moong,R.drawable.mustardjpeg,R.drawable.peas,R.drawable.oat,R.drawable.bittergourd,R.drawable.pumpkin,R.drawable.jute,
                R.drawable.radish,R.drawable.caroot,R.drawable.masoor,R.drawable.bajra,R.drawable.chickenpeas,R.drawable.cauliflower,R.drawable.cucumber
                };

                            String[] cropdesc={"bbjhbj","bvhmbjhb","bmjhbjb","hhkuh","jghj","gjhvjgv","gjjhgbjh",
                "jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj","jghj",
                "jghj","jghj","jghj","jghj","hjghg"};


                            String[] crop_desc=new String[f.length];
                            int[] cropimage=new int[f.length];
                            String[] cropname = new String[f.length];


                            for (int i=0;i<f.length;i++){
                                int position=i;
                                if((f[position]<=temperature+10)&&(f[position]>=temperature-10)){
                                    cropname[i]=name[position];
                                    cropimage[i]=image[position];
                                    crop_desc[i]=cropdesc[position];
                                }
                            }
                            suggest.setVisibility(View.VISIBLE);
                            recyclerView.setVisibility(View.VISIBLE);
                            recyclerView.setAdapter(new CropAdapter(cropimage,cropname,getContext()));


                        }else if(response.code()==404){
                            Toast.makeText(getContext(),"Please enter valid city name",Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<WeatherResult> call, Throwable t) {
                        Toast.makeText(getContext(),"Connect to Internet",Toast.LENGTH_LONG).show();
                    }
                });

            }
        });
        return root;
    }

}
