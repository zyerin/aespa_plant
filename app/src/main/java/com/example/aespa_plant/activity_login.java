package com.example.aespa_plant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {
    TextView sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sign = findViewById(R.id.signin);

        sign.setOnClickListener(v->{
            //signup 액티비티 ( 회원가입 페이지로 이동)
            Intent intent = new Intent(this, activity_signup.class);
            startActivity(intent);
        });



    }
}