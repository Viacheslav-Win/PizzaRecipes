package com.example.pizzarecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

  class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;
    Context context;


    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,
                parent, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        RecyclerViewItem recyclerViewItem = arrayList.get(position);

        holder.imageView.setImageResource(recyclerViewItem.getImageIcon());
        holder.textView1.setText(recyclerViewItem.getName());
        holder.textView2.setText(recyclerViewItem.getDescription());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecyclerViewViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            RecyclerViewItem pizzaRecipeItems = arrayList.get(position);

            Intent intent = new Intent(context,RecipeActivity.class);
            intent.putExtra("image", pizzaRecipeItems.getImageIcon());
            intent.putExtra("name", pizzaRecipeItems.getName());
            intent.putExtra("description",pizzaRecipeItems.getDescription());
            intent.putExtra("recipe", pizzaRecipeItems.getRecipe());
            context.startActivity(intent);
        }
    }
        public RecyclerViewAdapter(ArrayList<RecyclerViewItem> arrayList,
                                   Context context) {

            this.arrayList = arrayList;
            this.context = context;

        }



}
