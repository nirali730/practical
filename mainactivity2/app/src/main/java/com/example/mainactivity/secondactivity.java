package com.example.mainactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class secondactivity extends AppCompatActivity {
    Button btn2;
    TextView tvname;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn2=findViewById(R.id.btn2);
        tvname=findViewById(R.id.tvname);

        Intent intent=getIntent();
        intent.getStringExtra("Name");
        tvname.setText(intent.getStringExtra("Name"));
        btn2.setOnClickListener(v -> {
            Intent i2 = new Intent(this, MainActivity.class);
            startActivity(i2);
        });
    }
}