package com.example.penisriwahyu.pointerb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SubActivitySD extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_sd);

        Typeface font = Typeface.createFromAsset(getAssets(), "ITCKRIST.ttf");

        //halaman sd
        Toolbar toolbar= (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        TextView tvHeading = (TextView) findViewById(R.id.teksMapel);
        tvHeading.setTypeface(font);

        Button btnMat = (Button) findViewById(R.id.sd_mat);
        Button btnIpa = (Button) findViewById(R.id.sd_ipa);
        Button btnIps = (Button) findViewById(R.id.sd_ips);
        Button btnBi = (Button) findViewById(R.id.sd_bind);
        Button btnIng = (Button) findViewById(R.id.sd_bing);

        btnMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySD.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",0);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnIpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySD.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",1);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnIps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySD.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",2);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySD.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",3);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySD.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",4);
                i.putExtras(arg);
                startActivity(i);
            }
        });
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_sub_activity2, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        if (id == R.id.home){
//            NavUtils.navigateUpFromSameTask(this);
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
