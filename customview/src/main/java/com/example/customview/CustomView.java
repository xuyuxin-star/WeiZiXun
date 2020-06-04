package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    private Paint paint;
    private Path path;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int startX = 10;
        int startY = 100;
        int stopX = 190;
        int stopY = 100;
        //画线
        canvas.drawLine(startX,startY,stopX,stopY,paint);
        //画圆
        canvas.drawCircle(60,60,40,paint);
        //画矩形
        path = new Path();
        //规划矩形的路径
        int x1=100,y1=5;
        int x2=100,y2=195;
        int x3=195,y3=195;
        int x4=195,y4=5;

        path.moveTo(x1,y1);
        //连接第一个点和第二个点
        path.lineTo(x2,y2);
        path.lineTo(x3,y3);
        path.lineTo(x4,y4);
        path.lineTo(x1,y1);
        canvas.drawPath(path,paint);

//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(5);
//        paint.setColor(Color.GRAY);
    }

}
