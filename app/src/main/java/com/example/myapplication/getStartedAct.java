package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class getStartedAct extends AppCompatActivity {

    Button btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btn_signin = findViewById(R.id.btn_signin);

        // berpindah act dengan cara mgnklick button signin menuju halaman sign in activity
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotosign = new Intent(getStartedAct.this, signinAct.class);
                startActivity(gotosign);
                finish();
            }
        });
    }
}
