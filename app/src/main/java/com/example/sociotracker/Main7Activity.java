package com.example.sociotracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Main7Activity extends AppCompatActivity {

    Spinner spinner4;
    Spinner spinner5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        spinner4=(Spinner)findViewById(R.id.spinner4);
        List<String> list4=new ArrayList<String>();
        list4.add("Select");
        list4.add("Online Banking");
        list4.add("Debit/Credit");
        list4.add("COD");

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list4);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(arrayAdapter);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                spinner4.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner5=(Spinner)findViewById(R.id.spinner5);
        List<String> list5=new ArrayList<String>();
        list5.add("Select");
        list5.add("Student");
        list5.add("Govt. Employee");
        list5.add("Business");
        list5.add("Private");

        ArrayAdapter<String> arrayAdapter1= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list5);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(arrayAdapter1);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                spinner5.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

}
