package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class StartActivity extends AppCompatActivity {

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // Check whether user is already logged in or not
        // If yes then directly show main page otherwise show login page
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() != null)   {
            Intent intent = new Intent(StartActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(StartActivity.this, loginActivity.class);
            startActivity(intent);
        }
    }
}