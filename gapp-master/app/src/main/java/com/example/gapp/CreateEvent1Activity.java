package com.example.gapp;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gapp.model.Event;
import com.example.gapp.model.EventWriter;

import java.util.ArrayList;

public class CreateEvent1Activity extends AppCompatActivity {

    EditText t1;
    EditText t2;
    EditText t3;
    TextView t4;
    NumberPicker np1;
    NumberPicker np2;
    NumberPicker np3;

    ArrayList <Patient> Ap = new ArrayList();
    Patient p2 = new Patient();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        np1= (NumberPicker) findViewById((R.id.numberPicker1));
        np2= (NumberPicker) findViewById((R.id.numberPicker2));
        np3= (NumberPicker) findViewById((R.id.numberPicker3));
        np1.setMaxValue(31);
        np2.setMaxValue(12);
        np3.setMinValue(1900);
        np3.setMaxValue(3000);

    }
    public void onSaveEventClick(View view){
        // Toast.makeText(this, "Make new event", Toast.LENGTH_SHORT).show();
        EventWriter db = new EventWriter(this);
        t1 = (EditText) findViewById(R.id.firstname);
        t2 = (EditText) findViewById(R.id.lastname);
        t3 = (EditText) findViewById(R.id.nhsnumber);
        t4 = (TextView) findViewById(R.id.eventdate);



        //t4 = (EditText) findViewById(R.id.eventdesc);
        String f_name = t1.getText().toString();
        String l_name = t2.getText().toString();
        String nhs_num = t3.getText().toString();
        String date1 = t4.getText().toString();
        String d1 = String.valueOf(np1.getValue());
        String d2 = String.valueOf(np2.getValue());
        String d3 = String.valueOf(np3.getValue());

        String stotal = d1 + "/" + d2 + "/" + d3;

        p2.setName(f_name, l_name);

       // p2.setDOB(stotal);
        //p2.setDOB();

        Ap.add(p2);

        String e_location = t2.getText().toString();
        String e_desc = t3.getText().toString();
        db.addEvent(f_name);
        db.addEvent(l_name);
        db.addEvent(nhs_num);
        db.addEvent(date1);
        db.addEvent(stotal);

        setContentView(R.layout.display_screen);
        // Toast.makeText(this, db.getSale(0).get_contents(), Toast.LENGTH_SHORT).show();
    }



}
