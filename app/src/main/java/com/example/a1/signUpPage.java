package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class signUpPage extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Spinner spinner;
    private Spinner spinner2;

    private static final String[] paths = {"Pakistan", "India","China"};
    private static final String[] paths2 = {"Lahore", "karachi","Islamabad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(signUpPage.this,
                android.R.layout.simple_spinner_item,paths);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(signUpPage.this,
                android.R.layout.simple_spinner_item,paths2);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);
    }

    public void handleSignUp (View view){
        Intent intent = new Intent(signUpPage.this,emailVerification.class);
        startActivity(intent);
    }
    public void handleLogin(View view){
        Intent intent = new Intent(signUpPage.this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}