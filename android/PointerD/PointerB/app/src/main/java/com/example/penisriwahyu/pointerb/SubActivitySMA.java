package com.example.penisriwahyu.pointerb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SubActivitySMA extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_sma);

        Typeface font = Typeface.createFromAsset(getAssets(), "ITCKRIST.ttf");

        Toolbar toolbar= (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        TextView tvHeading = (TextView) findViewById(R.id.teksMapel);
        tvHeading.setTypeface(font);

        Button btnMat  = (Button) findViewById(R.id.sma_mat_ipa);
        Button btnBio  = (Button) findViewById(R.id.sma_biologi);
        Button btnFis  = (Button) findViewById(R.id.sma_fisika);
        Button btnKim  = (Button) findViewById(R.id.sma_kimia);
        Button btnEko  = (Button) findViewById(R.id.sma_ekonomi);
        Button btnBind = (Button) findViewById(R.id.sma_bind);
        Button btnBing = (Button) findViewById(R.id.sma_bing);

        btnMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySMA.this, smaSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",0);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySMA.this, smaSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",1);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnFis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySMA.this, smaSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",2);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnKim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySMA.this, smaSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",3);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnEko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySMA.this, smaSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",4);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnBind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySMA.this, smaSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",6);
                i.putExtras(arg);
                startActivity(i);
            }
        });
        btnBing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivitySMA.this, smaSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",7);
                i.putExtras(arg);
                startActivity(i);
            }
        });
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.men_sub_activity_sma, menu);
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
//
//        return super.onOptionsItemSelected(item);
//    }
}
