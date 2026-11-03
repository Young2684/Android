package com.example.ch09;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Self0901 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.RED);
            paint.setStrokeWidth(20);
            canvas.drawLine(60, 60, 900, 900, paint);

            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(Color.GREEN);
            canvas.drawLine(900, 60, 60, 900, paint);

            RectF rectF = new RectF();

            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(10);
            paint.setStyle(Paint.Style.STROKE);
            rectF.set(420, 200, 420 + 100, 200 + 100);
            canvas.drawRect(rectF, paint);

            paint.setColor(Color.RED);
            rectF.set(420, 690, 420 + 100, 690 + 100);
            canvas.drawRect(rectF, paint);

            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(60, 390, 60 + 200, 390 + 200);
            canvas.drawRect(rectF, paint);

            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(60, 390, 60 + 200, 390 + 200);
            canvas.drawRect(rectF, paint);

            paint.setColor(Color.GRAY);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5);
            rectF.set(700, 390, 700 + 200, 390 + 200);
            canvas.drawRoundRect(rectF, 20,20,paint);

            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(10);
            rectF.set(60, 950, 60 + 900, 950 + 300);
            canvas.drawOval(rectF, paint);

            rectF.set(450, 1000, 450 + 120, 1000 + 120);
            canvas.drawArc(rectF, 40, 110, true, paint);
        }
    }

}
