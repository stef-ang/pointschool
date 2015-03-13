package com.example.penisriwahyu.pointerb;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;


public class SubActivity extends ActionBarActivity {
    public static final String TAG="PENI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Toolbar toolbar= (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        switch(ev.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "Activity  dispatchTouchEvent Down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "Activity  dispatchTouchEvent Move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "Activity  dispatchTouchEvent Up");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "Activity  dispatchTouchEvent cancel");
                break;
        }
        boolean b = super.dispatchTouchEvent(ev);
        Log.d(TAG, "Activity dispatchTouchEvent RETURNS " + b);
        return false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getActionMasked()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "Activity on Touch Down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "Activity on Touch Move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "Activity on Touch Up");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "Activity on Touch Cancel");
                break;
        }
        boolean b = super.onTouchEvent(event);
        Log.d(TAG, "Activity on Touch RETURNS " + b);
        return b;
    }

}
