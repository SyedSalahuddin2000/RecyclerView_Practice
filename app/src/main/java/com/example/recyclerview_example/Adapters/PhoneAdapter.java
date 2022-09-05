package com.example.recyclerview_example.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.room.parser.expansion.Position;

import com.example.recyclerview_example.Models.PhoneModel;
import com.example.recyclerview_example.R;

import java.util.ArrayList;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.viewHolder> {
    ArrayList<PhoneModel> list;
    Context context;

    public PhoneAdapter(ArrayList<PhoneModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    PhoneModel model=list.get(position);
    holder.phone.setImageResource(model.getImage());
    holder.NameText.setText(model.getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView phone;
        TextView NameText;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            phone=itemView.findViewById(R.id.phone);
            NameText=itemView.findViewById(R.id.NameText);
        }
    }
}
