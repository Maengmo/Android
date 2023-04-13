package com.example.numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Activity7 extends AppCompatActivity {
    TextView Hint;
    EditText etNum;
    Button btnStart, btnResult;
    ImageView rp;

    int inputNum, gameNum, count;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hint = (TextView) findViewById(R.id.text2);
        etNum = (EditText) findViewById(R.id.text);
        btnStart = (Button) findViewById(R.id.button);
        btnResult = (Button) findViewById(R.id.button1);
        rp = (ImageView) findViewById(R.id.imageView);

        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                count = 0;
                gameNum = rand.nextInt(100) + 1;
                btnResult.setEnabled(true);
                btnStart.setEnabled(false);
                Hint.setText("자! 어디한번 맞춰보시지!");
            }

        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                inputNum=Integer.parseInt(etNum.getText().toString());
                count++;
                if(gameNum!=0){
                    if(gameNum>inputNum){
                        Hint.setText("숫자가 작습니다.(시도횟수="+count+"회");
                        rp.setImageResource(R.drawable.rop2);
                    }else if(gameNum<inputNum){
                        Hint.setText("숫자가 큽니다.(시도횟수="+count+"회");
                        rp.setImageResource(R.drawable.rp3);
                    }else if(gameNum==inputNum) {
                        Hint.setText("오 쫌하는군!!"   +count+" 번 만에 맞췄습니다!");
                        rp.setImageResource(R.drawable.rop3);

                        btnStart.setEnabled(true);
                        btnResult.setEnabled(false);
                    }
                }else {
                    Hint.setText("어디한번 눌러보시지!!");

                }
                etNum.setText("");                   }
        });

    }
}
