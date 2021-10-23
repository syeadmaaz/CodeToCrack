package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        Button register = findViewById(R.id.register);

        auth = FirebaseAuth.getInstance();

        login.setOnClickListener(v -> {
            String txt_email = username.getText().toString();
            String txt_password = password.getText().toString();
            loginuser(txt_email,txt_password);
        });

        register.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            finish();
        });

    }

    private void loginuser(String email, String password) {

        auth.signInWithEmailAndPassword(email,password).addOnSuccessListener(authResult -> {
            Toast.makeText(LoginActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this,DashActivity.class));
            finish();
        });
    }

}
