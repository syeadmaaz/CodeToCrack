package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class DashActivity extends AppCompatActivity {
    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        logout = findViewById(R.id.logout);

        logout.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            Toast.makeText(DashActivity.this,"Logged Out",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(DashActivity.this,MainActivity.class));
        });

        HashMap<String , Object> map = new HashMap<>();
        map.put("Name","Maaz");
        map.put("Email","syeadmaazahmed@gmail.com");

        FirebaseDatabase.getInstance().getReference().child("Programming Knowledge").child("Multiple Values").updateChildren(map);
    }
}
