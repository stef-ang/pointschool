package com.example.penisriwahyu.pointerb;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Peni Sriwahyu on 3/12/2015.
 */
public class MyView extends TextView {
    public static final String TAG="PENI";
    Paint paint = null;

    public MyView(Context context){
        super(context);

        init();
    }


    public MyView(Context context, AttributeSet attrs){
        super(context, attrs);
        init();
    }

    public void init(){
        paint = new Paint();
        paint.setAntiAlias(true);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        switch (ev.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "My View dispatchTouch Down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "My View dispatchTouch Move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "My View dispatchTouch Up");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "My View dispatchTouch Cancel");
                break;
        }
        boolean b = super.dispatchTouchEvent(ev);
        Log.d(TAG, "My View dispatchTouch Return "+ b);
        return b;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event){
        getParent().requestDisallowInterceptTouchEvent(true);
        switch (event.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "My View on Touch Down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "My View on Touch Move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "My View on Touch Up");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "My View on Touch Cancel");
                break;
        }
        //boolean b = super.onTouchEvent(event);
        Log.d(TAG, "My View on Touch RETURNS " + true);
        return true;
    }
}
