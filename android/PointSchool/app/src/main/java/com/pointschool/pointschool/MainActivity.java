package com.pointschool.pointschool;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.pointschool.pointschool.Model.Bab;
import com.pointschool.pointschool.Model.Kelas;
import com.pointschool.pointschool.Model.Mapel;
import com.pointschool.pointschool.Model.Materi;
import com.pointschool.pointschool.Model.PaketSoal;
import com.pointschool.pointschool.Model.Soal;
import com.pointschool.pointschool.Model.Subbab;

import java.util.List;


public class  MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new LongOperation(this).execute();

        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }
            DatabaseHandler db = new DatabaseHandler(getApplicationContext());

           /* List<Bab> babs = db.getAllBab();
            Log.d("Bab","LIST");
            for(Bab bab : babs){
                Log.d("Bab", bab.toString());
            }
            List<Kelas> kelass = db.getAllKelas();
            Log.d("kelas","LIST");
            for(Kelas kelas : kelass){
                Log.d("kelas", kelas.toString());
            }
            List<Mapel> mapels = db.getAllMapel();
            Log.d("Mapel","LIST");
            for(Mapel mapel : mapels){
                Log.d("Mapel", mapel.toString());
            }
            List<Materi> materis = db.getAllMateri();
            Log.d("Materi","LIST");
            for(Materi materi : materis){
                Log.d("Materi", materi.toString());
            }
            List<PaketSoal> paketsoals = db.getAllPaketSoal();
            Log.d("PaketSoal","LIST");
            for(PaketSoal paketsoal : paketsoals){
                Log.d("Paketsoal", paketsoal.toString());
            }
            List<Soal> soals = db.getAllSoal();
            Log.d("Soal","LIST");
            for(Soal soal : soals){
                Log.d("Soal", soal.toString());
            }
            List<Subbab> subbabs = db.getAllSubbab();
            Log.d("Subbab","LIST");
            for(Subbab subbab : subbabs){
                Log.d("Subbab", subbab.toString());
            }*/
            BrowserFragment firstFragment = new BrowserFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            firstFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        return super.onOptionsItemSelected(item);
    }


}
