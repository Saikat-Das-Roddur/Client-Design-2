package com.saikat.clientdesign2.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.saikat.clientdesign2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeatherFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.weather_fragment, container, false);

        return rootView;

    }

}
