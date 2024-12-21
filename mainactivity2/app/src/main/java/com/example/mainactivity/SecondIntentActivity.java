package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondIntentActivity extends AppCompatActivity {

    TextView tvname,tvname2,tvname3,tvname4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second_intent);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvname=findViewById(R.id.tvname);
        tvname2=findViewById(R.id.tvname2);
        tvname3=findViewById(R.id.tvname3);
        tvname4=findViewById(R.id.tvname4);

        Intent intent=getIntent();
        tvname.setText(intent.getStringExtra("Name"));
        tvname.setText(intent.getStringExtra("Age"));
        tvname.setText(intent.getStringExtra("Mail"));
        tvname.setText(intent.getStringExtra("phone no"));
    }
}