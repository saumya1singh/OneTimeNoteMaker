package com.example.notemaker;

import android.support.v7.app.AppCompatActivity;

public class Notes extends AppCompatActivity {

    String string;

    public Notes(String string)
    {
        this.string = string;
    }


    public CharSequence getString()
    {
        return (CharSequence) string;
    }
}
