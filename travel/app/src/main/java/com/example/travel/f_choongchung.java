package com.example.travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class f_choongchung extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_choongchung);

        Button b = (Button)findViewById(R.id.Button1);
        Button c = (Button)findViewById(R.id.Button2);
        Button d = (Button)findViewById(R.id.Button3);
        Button e = (Button)findViewById(R.id.Button4);
        Button f = (Button)findViewById(R.id.Button5);
        Button g = (Button)findViewById(R.id.Button6);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_choongchung.this,
                        f_choongchung_dangjin.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_choongchung.this,
                        f_choongchung_taean.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_choongchung.this,
                        f_choongchung_asan.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_choongchung.this,
                        f_choongchung_cheonan.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_choongchung.this,
                        f_choongchung_jaecheon.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_choongchung.this,
                        f_choongchung_nonsan.class);
                startActivity(intent);
            }
        });
    }
}
