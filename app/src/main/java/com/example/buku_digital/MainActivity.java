package com.example.buku_digital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button healt,education,profile,naonweh,yaajah,wahh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        healt = findViewById(R.id.buttonHealth);
        education = findViewById(R.id.buttonEducation);
        profile = findViewById(R.id.buttonProfile);
        naonweh = findViewById(R.id.buttonComfort);
        yaajah = findViewById(R.id.buttonFinance);
        wahh = findViewById(R.id.buttonGoal);

        healt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,healt.class);
                startActivity(i);
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,educ.class);
                startActivity(i);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,prof.class);
                startActivity(i);
            }
        });
        naonweh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,compor.class);
                startActivity(i);
            }
        });
        yaajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,finan.class);
                startActivity(i);
            }
        });
        wahh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,goal.class);
                startActivity(i);
            }
        });
    }
}
