package com.example.penisriwahyu.pointerb;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import java.util.jar.Attributes;


public class MyLayout extends FrameLayout {
    public static final String TAG="PENI";
    Paint paint = null;

    public MyLayout(Context context){
        super(context);

        init();
    }


    public MyLayout(Context context, AttributeSet attrs){
        super(context, attrs);
        init();
    }

    public void init(){
        paint = new Paint();
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        switch (ev.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout dispatchTouch Down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout dispatchTouch Move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout dispatchTouch Up");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout dispatchTouch Cancel");
                break;
        }
        boolean b = super.dispatchTouchEvent(ev);
        Log.d(TAG, "MyLayout dispatchTouch Return "+ b);
        return b;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev){
        switch (ev.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout onInterceptTouch Down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout onInterceptTouch Move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout onInterceptTouch Up");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout onInterceptTouch Cancel");
                break;
        }
        boolean b = super.onInterceptTouchEvent(ev);
        Log.d(TAG, "MyLayout onInterceptTouch Return "+ b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "MyLayout on Touch Down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "MyLayout on Touch Move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "MyLayout on Touch Up");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "MyLayout on Touch Cancel");
                break;
        }
        boolean b = super.onTouchEvent(event);
        Log.d(TAG, "Activity on Touch RETURNS " + b);
        return b;
    }
}
