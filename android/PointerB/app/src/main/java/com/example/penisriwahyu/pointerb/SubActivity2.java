package com.example.penisriwahyu.pointerb;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class SubActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_sd);
        //halaman sd
        Toolbar toolbar= (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        Button btnMat = (Button) findViewById(R.id.sd_mat);
        btnMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivity2.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",0);
                i.putExtras(arg);
                startActivity(i);
            }
        });

        Button btnIpa = (Button) findViewById(R.id.sd_ipa);
        btnIpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivity2.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",1);
                i.putExtras(arg);
                startActivity(i);
            }
        });

        Button btnIps = (Button) findViewById(R.id.sd_ips);
        btnIps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivity2.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",2);
                i.putExtras(arg);
                startActivity(i);
            }
        });

        Button btnBi = (Button) findViewById(R.id.sd_bind);
        btnBi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivity2.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",3);
                i.putExtras(arg);
                startActivity(i);
            }
        });

        Button btnIng = (Button) findViewById(R.id.sd_bing);
        btnIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SubActivity2.this, sdSlide.class);
                Bundle arg = new Bundle();
                arg.putInt("NoMapel",4);
                i.putExtras(arg);
                startActivity(i);
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub_activity2, menu);
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
        if (id == R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }
}
