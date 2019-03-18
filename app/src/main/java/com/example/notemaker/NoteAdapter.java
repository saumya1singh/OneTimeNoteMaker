package com.example.notemaker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteHolder> {

    ArrayList <Notes> notes1 =new ArrayList<>();  //arraylist  to store data

    public NoteAdapter(ArrayList<Notes> notes1) {
        this.notes1 = notes1;
    }    //constructor

    @NonNull
    @Override
    public NoteAdapter.NoteHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {    //called when no view is created

        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());  //to inflate the view
        View view=layoutInflater.inflate(R.layout.item_row,viewGroup,false);
        return new NoteHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder noteHolder, int i) {  //is called for each row
        Notes present= notes1.get(i);  //object of same type Notes
         noteHolder.b.setText(present.getString());
//        noteHolder.a.setText(present.getString());
    }

    @Override
    public int getItemCount() {
        return notes1.size();
    }

    public class NoteHolder extends RecyclerView.ViewHolder {

        TextView b,c;
        public NoteHolder(@NonNull View itemView) {
            super(itemView);
            b=itemView.findViewById(R.id.t);
            c=itemView.findViewById(R.id.ti);
//            a=itemView.findViewById(R.id.x);
        }
    }
}
