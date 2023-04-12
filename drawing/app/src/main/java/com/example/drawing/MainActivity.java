package com.example.drawing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float scaleX = 1.0f, scaleY = 1.0f, rotateAngle;
    private SingleTouchView drawView;
    private ImageButton currPaint;
    private View new_btn;
    private View draw_btn;
    private View erase_btn;
    private View save_btn;
    private View imageButton;
    private View imageButton2;
    private View imageButton3;
    private View imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawView = (SingleTouchView) findViewById(R.id.drawing);
        LinearLayout paintLayout = (LinearLayout) findViewById(R.id.paint_colors);
        currPaint = (ImageButton) paintLayout.getChildAt(0);
        new_btn = findViewById(R.id.new_btn);
        draw_btn = findViewById(R.id.draw_btn);
        erase_btn = findViewById(R.id.erase_btn);
        save_btn = findViewById(R.id.save_btn);
        imageButton = findViewById(R.id.imageButton);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);


        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    //새 파일
                    case R.id.new_btn:
                        drawView.setMenu(0);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;

                    //그리기 모드
                    case R.id.draw_btn:
                        drawView.setMenu(1);

                        //그리기 모드 버튼을 눌러야 색상 버튼들이 보임
                        paintLayout.setVisibility(View.VISIBLE);
                        break;

                    //지우개 모드
                    case R.id.erase_btn:
                        drawView.setMenu(2);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;

                    //저장 모드
                    case R.id.save_btn:
                        drawView.setMenu(1);
                        paintLayout.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_SHORT).show();
                        break;
                    //확대모드
                    case R.id.imageButton:
                        drawView.setMenu(3);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;
                    //축소모드
                    case R.id.imageButton2:
                        drawView.setMenu(4);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;
                    //왼쪽회전
                    case R.id.imageButton3:
                        drawView.setMenu(5);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;
                    //오른쪽회전
                    case R.id.imageButton4:
                        drawView.setMenu(6);
                        paintLayout.setVisibility(View.INVISIBLE);
                        break;
                    default:
                        break;

                }
            }
        };
        new_btn.setOnClickListener(onClickListener);
        draw_btn.setOnClickListener(onClickListener);
        erase_btn.setOnClickListener(onClickListener);
        save_btn.setOnClickListener(onClickListener);
        imageButton.setOnClickListener(onClickListener);
        imageButton2.setOnClickListener(onClickListener);
        imageButton3.setOnClickListener(onClickListener);
        imageButton4.setOnClickListener(onClickListener);
    }
    public void color_clicked(View view) {
        if (view != currPaint) {
            String color = view.getTag().toString();
            drawView.setColor(color);
            currPaint = (ImageButton) view;
        }

        else {
            drawView.setColor("#00000000");
            currPaint = (ImageButton) view;
        }
    }


    public void clicked(View view) {
        if (view != currPaint) {
            String color = view.getTag().toString();
            drawView.setColor(color);
            currPaint = (ImageButton) view;
        }

    }


}