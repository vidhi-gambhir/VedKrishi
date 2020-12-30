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

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SuggestionFragment extends Fragment {
    TextView winfo,message;
    EditText cityName;
    Button button;
    View root;
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
        button=root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Retrofit retrofit=new Retrofit().Builder
//                        .baseUrl("https://api.openweathermap.org/data/2.5/")
//                        .addConverterFactory(GsonConverterFactory.create())
//                        .build();
                AuthenticationApi api=ApiClient.getClient().create(AuthenticationApi.class);

                Call<WeatherResult> weatherCall=api.getWeather(cityName.getText().toString().trim(),apikey);
                weatherCall.enqueue(new Callback<WeatherResult>() {
                    @Override
                    public void onResponse(Call<WeatherResult> call, Response<WeatherResult> response) {
                        if(response.isSuccessful()){
                            WeatherResult mydata=response.body();
                            Main main=mydata.getMain();
                            Double temp=main.getTemp();
                            Integer temperature=(int)(temp-273.15);
                            winfo.setText(String.valueOf(temperature)+" ℃");

                            List<Weather> weather=mydata.getWeather();
                            String desc=weather.get(0).getDescription();
                            String description=desc;
                            message.setText(description+" ");
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
