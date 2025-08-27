package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView textGreeting;
    Button buttonContinue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        textGreeting=findViewById(R.id.textGreeting);
        buttonContinue=findViewById(R.id.buttonContinue);

        String username = getIntent().getStringExtra("username");
        if (username != null && !username.isEmpty()) {
            String greeting = getString(R.string.welcome_format, username);
            textGreeting.setText(greeting);
        }

        buttonContinue.setOnClickListener(view -> {
            Intent intent=new Intent(WelcomeActivity.this,GreatHallActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
