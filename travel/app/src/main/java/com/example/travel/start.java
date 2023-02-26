package com.example.travel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() { goMainActivity(); }
        }, 2000);
    }

    public void goMainActivity() {
        Intent intent = new Intent(this, main.class);
        startActivity(intent);
        finish();
    }
}
