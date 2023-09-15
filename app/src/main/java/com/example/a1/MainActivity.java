package com.example.a1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void handleLoginMain (View view){
        Intent intent = new Intent(MainActivity.this, homepage.class);
        startActivity(intent);
    }

    public void handleForgotPassword(View view){
        Intent intent = new Intent(MainActivity.this,forgotPassword.class);
        startActivity(intent);
    }
    public void handleSignUp(View view){
        Intent intent = new Intent(MainActivity.this,signUpPage.class);
        startActivity(intent);
    }
}