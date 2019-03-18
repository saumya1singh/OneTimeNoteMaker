package com.example.notemaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Notes> notes = new ArrayList<>();  //arraylist for passing values to each row in recyclerview

        Button save;
        final EditText edit;
        save = findViewById(R.id.b);
        edit = findViewById(R.id.a);

//       String s;
//       s= edit.getText().toString();     //on clicking button the input should be entred

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s;
                s= edit.getText().toString();
                notes.add(new Notes(s)) ;//on clicking button the input should be entred
                RecyclerView rv;
                rv = findViewById(R.id.rv);
                NoteAdapter noteadapter = new NoteAdapter(notes);
                rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                rv.setAdapter(noteadapter);
                Toast.makeText(MainActivity.this,"Note saved", Toast.LENGTH_SHORT).show();
            }
        });

    }
}