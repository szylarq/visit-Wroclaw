package com.szylarq.wroclaw_heritage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewPagerAdapter extends RecyclerView.Adapter<MyViewPagerAdapter.ViewHolder> {

    int[] images;
    int[] headers;
    int[] descriptions;

    public MyViewPagerAdapter(int[] images, int[] headers, int[] descriptions){

        this.images = images;
        this.headers = headers;
        this.descriptions = descriptions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.slide_page_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.headerTextView.setText(headers[position]);
        holder.descriptionTextView.setText(descriptions[position]);
        holder.imageView.setBackgroundResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView headerTextView;
        TextView descriptionTextView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            descriptionTextView = itemView.findViewById(R.id.description);
            headerTextView = itemView.findViewById(R.id.header);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
