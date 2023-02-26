package com.example.travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class f_seoul extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_seoul);
        Button b = (Button)findViewById(R.id.Button1);
        Button c = (Button)findViewById(R.id.Button2);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul.this,
                        f_seoul_north.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul.this,
                        f_seoul_south.class);
                startActivity(intent);
            }
        });
    }
}

