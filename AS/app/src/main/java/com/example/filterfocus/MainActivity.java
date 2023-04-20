package com.example.filterfocus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView email =(TextView) findViewById(R.id.email);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton signinbtn =(MaterialButton) findViewById(R.id.signinbtn);

        //admin@gmail.com and admin123
        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin123")){
                    // correct
                    Toast.makeText(MainActivity.this, "Sign in successfully", Toast.LENGTH_SHORT).show();
                } else {
                    // incorrect
                    Toast.makeText(MainActivity.this, "Sign in Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}