package com.example.sociotracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {
    Spinner spinner1;
    Spinner spinner2;
    private Button button;
    private EditText editTextfirstname;
    private EditText editTextlastname;
    private EditText editTextdob;
    private EditText editTextusername;
    private EditText editTextpassword;
    private EditText editTextconfirm;
    private EditText editTextemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        spinner1=(Spinner)findViewById(R.id.spinner1);

        List<String> list1=new ArrayList<String>();
        list1.add("Select Gender");
        list1.add("Male");
        list1.add("Female");
        list1.add("Others");

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                spinner1.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner2 =(Spinner)findViewById(R.id.spinner2);
        List<String> list2=new ArrayList<String>();
        list2.add("Select");
        list2.add("Yes");
        list2.add("No");

        ArrayAdapter<String> arrayAdapter2= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner2.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        editTextfirstname= findViewById(R.id.firstname_text);
        editTextlastname= findViewById(R.id.lastname_text);
        editTextdob= findViewById(R.id.dob);
        editTextusername= findViewById(R.id.username_text);
        editTextpassword= findViewById(R.id.password_text);
        editTextconfirm= findViewById(R.id.confirm_text);
        editTextemail= findViewById(R.id.email_text);
        button= findViewById(R.id.submit_button);

        editTextfirstname.addTextChangedListener(firstnameTextWatcher);
        editTextlastname.addTextChangedListener(firstnameTextWatcher);
        editTextdob.addTextChangedListener(firstnameTextWatcher);
        editTextusername.addTextChangedListener(firstnameTextWatcher);
        editTextpassword.addTextChangedListener(firstnameTextWatcher);
        editTextconfirm.addTextChangedListener(firstnameTextWatcher);
        editTextemail.addTextChangedListener(firstnameTextWatcher);




        button = (Button) findViewById(R.id.submit_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });



    }
    public void openActivity5(){
        Intent intent= new Intent(this,Main5Activity.class);
        startActivity(intent);

    }

    private TextWatcher firstnameTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String firstnameInput= editTextfirstname.getText().toString().trim();
            String lastnameInput= editTextlastname.getText().toString().trim();
            String dobInput= editTextdob.getText().toString().trim();
            String usernameInput= editTextusername.getText().toString().trim();
            String passwordInput= editTextpassword.getText().toString().trim();
            String confirmInput= editTextconfirm.getText().toString().trim();
            String emailInput= editTextemail.getText().toString().trim();

            button.setEnabled(!firstnameInput.isEmpty()&& !lastnameInput.isEmpty() && !dobInput.isEmpty() && !usernameInput.isEmpty() && !passwordInput.isEmpty() && !confirmInput.isEmpty() && !emailInput.isEmpty());


        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
