package com.example.loginsign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.btn_login);
        Button c = (Button)findViewById(R.id.btn_register);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast myToast = Toast.makeText(getApplicationContext(),"로그인이 되었습니다.", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast myToast = Toast.makeText(getApplicationContext(),"회원가입 화면으로 이동합니다", Toast.LENGTH_SHORT);
                myToast.show();
                Intent intent = new Intent(Activity4.this,
                        RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}