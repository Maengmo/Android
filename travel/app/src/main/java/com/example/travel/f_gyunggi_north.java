package com.example.travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class f_gyunggi_north extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_gyunggi_north);

        Button b = (Button)findViewById(R.id.Button1);
        Button c = (Button)findViewById(R.id.Button2);
        Button d = (Button)findViewById(R.id.Button3);
        Button e = (Button)findViewById(R.id.Button4);
        Button f = (Button)findViewById(R.id.Button5);
        Button g = (Button)findViewById(R.id.Button6);
        Button h = (Button)findViewById(R.id.Button7);
        Button i = (Button)findViewById(R.id.Button8);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_gyunggi_north.this,
                        f_gyunggi_north_yuncheon.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_gyunggi_north.this,
                        f_gyunggi_north_pocheon.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_gyunggi_north.this,
                        f_gyunggi_north_pajoo.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_gyunggi_north.this,
                        f_gyunggi_north_gapyung.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_gyunggi_north.this,
                        f_gyunggi_north_ilsan.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_gyunggi_north.this,
                        f_gyunggi_north_yangjoo.class);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_gyunggi_north.this,
                        f_gyunggi_north_namyangjoo.class);
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_gyunggi_north.this,
                        f_gyunggi_north_eujungboo.class);
                startActivity(intent);
            }
        });
    }
}
