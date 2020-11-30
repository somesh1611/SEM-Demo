package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvSignUp = findViewById(R.id.tvSignUp);
        TextView tvSignUp2 = findViewById(R.id.tvSignUp2);
        tvSignUp.setOnClickListener(onClickSignUp());
        tvSignUp2.setOnClickListener(onClickSignUp());

    }

    private View.OnClickListener onClickSignUp(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,signup.class);
                MainActivity.this.startActivity(intent);
            }
        };
    }
}