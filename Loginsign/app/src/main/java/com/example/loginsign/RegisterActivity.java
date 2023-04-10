package com.example.loginsign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button b = (Button) findViewById(R.id.validateButton);
        Button c = (Button) findViewById(R.id.btn_register);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast myToast = Toast.makeText(getApplicationContext(), "사용하실 수 있는 아이디입니다.", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast myToast = Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT);
                myToast.show();
                Intent intent = new Intent(RegisterActivity.this,
                        Activity4.class);
                startActivity(intent);
            }
        });
    }
}

