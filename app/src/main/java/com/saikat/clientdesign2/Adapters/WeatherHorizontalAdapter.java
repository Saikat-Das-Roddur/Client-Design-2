package com.saikat.clientdesign2.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saikat.clientdesign2.Models.Weather;
import com.saikat.clientdesign2.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class WeatherHorizontalAdapter extends RecyclerView.Adapter<WeatherHorizontalAdapter.ViewHolder> {
    Context context;
    ArrayList<Weather> weatherList = new ArrayList<>();

    public WeatherHorizontalAdapter(Context context, ArrayList<Weather> weatherList) {
        this.context = context;
        this.weatherList = weatherList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.weather_rv,parent,false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherHorizontalAdapter.ViewHolder holder, int position) {

        Picasso.get().load(weatherList.get(position).getTodayWeatherImage()).into(holder.imageViewTodayWeatherImage);
        Picasso.get().load(weatherList.get(position).getOneHourIntervalWeatherImage()).into(holder.imageViewOneHourIntervalWeatherImage);
        holder.textViewDay.setText(weatherList.get(position).getDay());
        holder.textViewDate.setText(weatherList.get(position).getDate());
        holder.textViewComment.setText(weatherList.get(position).getComment());
        holder.textViewTodayTemperature.setText(weatherList.get(position).getMaxTemperature()+"/"+weatherList.get(position).getMinTemperature());
        holder.textViewTime.setText(weatherList.get(position).getTimeFormat());
        holder.textViewTimeFormat.setText(weatherList.get(position).getTimeFormat());
        holder.textViewHourlyTemperature.setText(weatherList.get(position).getHourlyTemperature());

    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewTodayWeatherImage,imageViewOneHourIntervalWeatherImage;
        TextView textViewDay,textViewDate,textViewTime,textViewTimeFormat,textViewComment,textViewHourlyTemperature,textViewTodayTemperature;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewTodayWeatherImage = itemView.findViewById(R.id.todayWeatherIv);
            imageViewOneHourIntervalWeatherImage = itemView.findViewById(R.id.hourlyWeatherTv);
            textViewDay = itemView.findViewById(R.id.dayTv);
            textViewDate = itemView.findViewById(R.id.dateTV);
            textViewTime = itemView.findViewById(R.id.timeTv);
            textViewTimeFormat = itemView.findViewById(R.id.timeFormatTv);
            textViewComment = itemView.findViewById(R.id.commentTv);
            textViewHourlyTemperature = itemView.findViewById(R.id.hourlyTempTv);
            textViewTodayTemperature = itemView.findViewById(R.id.todayTempTv);
        }
    }
}
