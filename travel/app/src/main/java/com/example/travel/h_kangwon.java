package com.example.travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class h_kangwon extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_kangwon);
        Button b = (Button)findViewById(R.id.Button1);
        Button c = (Button)findViewById(R.id.Button2);
        Button d = (Button)findViewById(R.id.Button3);
        Button e = (Button)findViewById(R.id.Button4);
        Button f = (Button)findViewById(R.id.Button5);
        Button g = (Button)findViewById(R.id.Button6);
        Button h = (Button)findViewById(R.id.Button7);
        Button i = (Button)findViewById(R.id.Button8);
        Button j = (Button)findViewById(R.id.Button9);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_chuncheon.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_pyungchang.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_donghae.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_injae.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_samcheok.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_hongcheon.class);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_kosung.class);
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_yangyang.class);
                startActivity(intent);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_kangwon.this,
                        h_kangwon_kangrung.class);
                startActivity(intent);
            }
        });
    }
}
