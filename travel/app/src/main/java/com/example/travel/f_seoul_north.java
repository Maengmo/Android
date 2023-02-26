package com.example.travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class f_seoul_north extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_seoul_north);

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
        Button l = (Button)findViewById(R.id.Button11);
        Button m = (Button)findViewById(R.id.Button12);
        Button n = (Button)findViewById(R.id.Button13);
        Button o = (Button)findViewById(R.id.Button14);
        Button p = (Button)findViewById(R.id.Button15);
        Button q = (Button)findViewById(R.id.Button16);
        Button r = (Button)findViewById(R.id.Button17);
        Button s = (Button)findViewById(R.id.Button18);
        Button t = (Button)findViewById(R.id.Button19);
        Button u = (Button)findViewById(R.id.Button20);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_eunpyung.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_mapo.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_sungbook.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_kangbook.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_sinchon.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_hongdae.class);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_yunnam.class);
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_dongdaemoon.class);
                startActivity(intent);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_jongro.class);
                startActivity(intent);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_sangsoo.class);
                startActivity(intent);
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_geondae.class);
                startActivity(intent);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_kwanghwamoon.class);
                startActivity(intent);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_insadong.class);
                startActivity(intent);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_myungdong.class);
                startActivity(intent);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_nowon.class);
                startActivity(intent);
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_daehakro.class);
                startActivity(intent);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_yongsan.class);
                startActivity(intent);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_kwangjinkoo.class);
                startActivity(intent);
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_joongkoo.class);
                startActivity(intent);
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(f_seoul_north.this,
                        f_seoul_north_etaewon.class);
                startActivity(intent);
            }
        });
    }
}
