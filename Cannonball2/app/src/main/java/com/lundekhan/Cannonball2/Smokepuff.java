package com.lundekhan.Cannonball2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Smokepuff extends GameObject{

    public int r;

    public Smokepuff(int x, int y){
        super.x = x;
        super.y = y;
        r=5;
    }

    public void update(){
        x-=10;
    }
    public void draw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(x-r, y-r, r , paint);
        canvas.drawCircle(x-r+4, y-r+4, r, paint);
        canvas.drawCircle(x-r+6, y-r+6,r ,paint);

    }


}
