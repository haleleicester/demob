/*
package com.example.gapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

*/
/**
 * Created by he282 on 11/11/2015.*//*



public class DisplayActivity extends AppCompatActivity {

    TextView tvnhs;
    TextView tvpn;
    TextView tvdob;
    EditText t1;
    EditText t2;
    EditText t3;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_screen);
        tvnhs = (TextView) findViewById(R.id.patientNHS);
        tvpn = (TextView) findViewById(R.id.patientName);
        tvdob = (TextView) findViewById(R.id.patientDOB);


        t1 = (EditText) findViewById(R.id.firstname);
        t2 = (EditText) findViewById(R.id.lastname);
        t3 = (EditText) findViewById(R.id.nhsnumber);

        String f_name = t1.getText().toString();
        String l_name = t2.getText().toString();
        String nhs_num = t3.getText().toString();

        tvnhs.setText(f_name);
        tvpn.setText(l_name);
        tvdob.setText(nhs_num);

    }

}
*/
