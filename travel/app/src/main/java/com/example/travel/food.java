package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class food extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);
        Button b = (Button)findViewById(R.id.Button1);
        Button c = (Button)findViewById(R.id.Button2);
        Button d = (Button)findViewById(R.id.Button3);
        Button e = (Button)findViewById(R.id.Button4);
        Button f = (Button)findViewById(R.id.Button5);
        Button g = (Button)findViewById(R.id.Button6);
        Button h = (Button)findViewById(R.id.Button7);
        Button i = (Button)findViewById(R.id.Button8);
        Button j = (Button)findViewById(R.id.Button9);
        Button k = (Button)findViewById(R.id.Button10);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_seoul.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_gyunggi_north.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_gyunggi_south.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_kangwon.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_choongchung.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_gyungsang_north.class);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_gyungsang_south.class);
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_junbook.class);
                startActivity(intent);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_junnam.class);
                startActivity(intent);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(food.this,
                        f_jeju.class);
                startActivity(intent);
            }
        });
    }
}
