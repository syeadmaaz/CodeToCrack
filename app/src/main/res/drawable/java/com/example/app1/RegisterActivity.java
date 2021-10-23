package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText username,password;
    private Button register;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        register = findViewById(R.id.register);
        auth = FirebaseAuth.getInstance();

        register.setOnClickListener(v -> {
            String txt_email = username.getText().toString();
            String txt_password = password.getText().toString();

            if(TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                Toast.makeText(RegisterActivity.this, "Empty Credentials!",Toast.LENGTH_SHORT).show();

            }else if(txt_password.length() < 6){
                Toast.makeText(RegisterActivity.this,"Password too short", Toast.LENGTH_SHORT).show();
            }
            else {
                registerUser(txt_email, txt_password);
            }

        });

    }

    private void registerUser(String email, String password) {
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(RegisterActivity.this, authResultTask -> {
                Toast.makeText(RegisterActivity.this,"Registration Successful",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(RegisterActivity.this,DashActivity.class));

            });
        }
 }

