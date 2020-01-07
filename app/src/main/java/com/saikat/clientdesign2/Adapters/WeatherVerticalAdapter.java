package com.saikat.clientdesign2.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saikat.clientdesign2.R;

import java.util.ArrayList;

public class WeatherVerticalAdapter extends RecyclerView.Adapter<WeatherVerticalAdapter.ViewHolder> {
    ArrayList<WeatherHorizontalAdapter> weatherHorizontalAdapterList = new ArrayList<>();
    Context context;

    public WeatherVerticalAdapter(ArrayList<WeatherHorizontalAdapter> weatherHorizontalAdapterList, Context context) {
        this.weatherHorizontalAdapterList = weatherHorizontalAdapterList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.horizontalRecyclerView);
        }
    }
}
