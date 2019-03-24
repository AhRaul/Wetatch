package com.example.wetatch;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CityCardFragment extends Fragment {

    private View infla;
    private String cityName;
    private String temperature;
    private TextView cityNameInCard;

    public CityCardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.infla = inflater.inflate(R.layout.fragment_city_card, container, false);
        cityNameInCard = (TextView) this.infla.findViewById(R.id.cityName);
        this.infla.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Snackbar.make(v, "You click on City fragment " + v.getId(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        return infla;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
