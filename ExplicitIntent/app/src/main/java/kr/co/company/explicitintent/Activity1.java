package kr.co.company.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1  extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        Button b = (Button)findViewById(R.id.Button01);
        Button c = (Button)findViewById(R.id.Button02);
        Button d = (Button)findViewById(R.id.Button03);
        Button e = (Button)findViewById(R.id.Button04);
        Button f = (Button)findViewById(R.id.Button05);
        Button g = (Button)findViewById(R.id.Button06);
        Button h = (Button)findViewById(R.id.Button07);
        Button i = (Button)findViewById(R.id.Button08);
        Button j = (Button)findViewById(R.id.Button09);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity2.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity3.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity4.class);
                startActivity(intent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity5.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity6.class);
                startActivity(intent);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity7.class);
                startActivity(intent);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity8.class);
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity9.class);
                startActivity(intent);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,
                        Activity10.class);
                startActivity(intent);
            }
        });
    }
}
