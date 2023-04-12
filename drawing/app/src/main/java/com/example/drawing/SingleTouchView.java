package com.example.drawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class SingleTouchView extends View {
    private Paint paint = new Paint();
    private Path path = new Path();
    private int paintColor = 0xFF000000;
    private Paint canvasPaint;
    private Canvas drawCanvas;
    private Bitmap canvasBitmap;
    float scaleX = 1.0f, scaleY = 1.0f, rotateAngle;
    MyView displayView;

    public class MyView extends View {
        public MyView(MainActivity context) {
            super(context);
        }
    }
    public SingleTouchView(Context context, AttributeSet attrs) {
        super(context, attrs);

        paint.setAntiAlias(true);
        paint.setStrokeWidth(10f);
        paint.setColor(paintColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        canvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        drawCanvas = new Canvas(canvasBitmap);
        canvasPaint = new Paint(Paint.DITHER_FLAG);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(canvasBitmap, 0, 0, canvasPaint);
        canvas.drawPath(path, paint);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        canvas.scale(scaleX, scaleY, centerX, centerY);
        canvas.rotate(rotateAngle, centerX, centerY);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.rp3);
        canvas.drawBitmap(bitmap,0,0,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float touchX = event.getX();
        float touchY = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(touchX, touchY);
                break;
            case MotionEvent.ACTION_UP:
                drawCanvas.drawPath(path, paint);
                path.reset();
                break;
            default:
                return false;
        }
        invalidate();
        return true;

    }

    public void setColor(String newColor) {
        invalidate();
        paintColor = Color.parseColor(newColor);
        paint.setColor(paintColor);
    }

    public void setMenu(int menu) {
        Log.d("!!singletouchview", String.valueOf(menu));
        if(menu == 0) {
            canvasBitmap.eraseColor(Color.WHITE);
            invalidate();
        }

        else if(menu == 2) {
            paint.setColor(0xFFFFFFFF);
            paint.setStrokeWidth(30f);
            paint.setStrokeCap(Paint.Cap.SQUARE);
        }
        else if(menu == 3) {
            scaleX += 0.3;
            scaleY += 0.3;
            invalidate();
        }
        else if(menu == 4) {
            scaleX -= 0.3;
            scaleY -= 0.3;
            invalidate();
        }
        else if(menu == 5) {
            rotateAngle -= 30;
            invalidate();
        }
        else if(menu == 6) {
            rotateAngle += 30;
            invalidate();
        }
        else {
        }
    }
}
