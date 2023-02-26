package com.example.travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class h_junnam extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_junnam);

        Button b = (Button)findViewById(R.id.Button1);
        Button c = (Button)findViewById(R.id.Button2);
        Button d = (Button)findViewById(R.id.Button3);
        Button e = (Button)findViewById(R.id.Button4);
        Button f = (Button)findViewById(R.id.Button5);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_junnam.this,
                        h_junnam_jindo.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_junnam.this,
                        h_junnam_koore.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_junnam.this,
                        h_junnam_kwangjoo.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_junnam.this,
                        h_junnam_sooncheon.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_junnam.this,
                        h_junnam_yusoo.class);
                startActivity(intent);
            }
        });
    }
}
