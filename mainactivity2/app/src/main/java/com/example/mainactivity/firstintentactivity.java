package com.example.mainactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class firstintentactivity extends AppCompatActivity {
    Button btn;
    EditText name1,age1,mail1,phno1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_firstintentactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn=findViewById(R.id.btn);
        name1=findViewById(R.id.name1);
        age1=findViewById(R.id.age1);
        mail1=findViewById(R.id.mail1);
        phno1=findViewById(R.id.phno1);
        btn.setOnClickListener(v -> {
            String name=name1.getText().toString().trim();
            int age=Integer.parseInt(age1.getText().toString().trim());
            String email=mail1.getText().toString().trim();
            int phno=Integer.parseInt(phno1.getText().toString().trim());
            Intent i1=new Intent(this, SecondIntentActivity.class);
            i1.putExtra("Name",name);
            i1.putExtra("Age",age);
            i1.putExtra("Mail",email);
            i1.putExtra("phone no",phno);
            startActivity(i1);

        });
    }
}