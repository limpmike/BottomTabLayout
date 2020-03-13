package com.mahm.bottomtab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BottomTabAdapter extends RecyclerView.Adapter<BottomTabAdapter.BottomViewHolder> {

    private List<String> items = Arrays.asList("1","2","3","4","5","6","7","8","9","10");

    @NonNull
    @Override
    public BottomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab_layout,parent,false);
        return new BottomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BottomViewHolder holder, int position) {
        TextView textView = (TextView)holder.itemView;
        textView.setText("Page"+items.get(position));
        int colorId = position %2 == 0 ? R.color.colorAccent : R.color.colorPrimary;
        textView.setBackgroundColor(ContextCompat.getColor(textView.getContext(),colorId));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class BottomViewHolder extends RecyclerView.ViewHolder {
        BottomViewHolder(View itemView) {
            super(itemView);
        }
    }
}
