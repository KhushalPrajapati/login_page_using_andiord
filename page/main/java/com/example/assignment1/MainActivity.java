package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private TextInputEditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(v -> {
            String username = editTextUsername.getText() != null
                    ? editTextUsername.getText().toString().trim()
                    : "";

            if (TextUtils.isEmpty(username)) {
                editTextUsername.setError("Please enter your username");
                editTextUsername.requestFocus();
                return;
            }



            Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
            i.putExtra("username", username);
            startActivity(i);
        });
    }
}
