package com.example.penisriwahyu.pointerb;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.example.penisriwahyu.pointerb.Model.Bab;
import com.example.penisriwahyu.pointerb.Model.Kelas;
import com.example.penisriwahyu.pointerb.Model.Mapel;
import com.example.penisriwahyu.pointerb.Model.Materi;
import com.example.penisriwahyu.pointerb.Model.PaketSoal;
import com.example.penisriwahyu.pointerb.Model.Soal;
import com.example.penisriwahyu.pointerb.Model.Subbab;

import java.util.List;

public class MainActivity extends ActionBarActivity {
    private int ever =0;
    private Toolbar toolbar;
    private DatabaseHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(db ==  null && ever == 0){
            this.ever=1;
            db = new DatabaseHandler(getApplicationContext());
            new LongOperation(this).execute();
        }

        List<Bab> babs = db.getAllBab();
        Log.d("Bab", "LIST");
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
        }


        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Fragment fg1 = (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.fragment_ku);
        if(fg1 == null){
            FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
            FragmentOne frag = new FragmentOne();
            fr.replace(R.id.fragment_ku,frag);
            fr.commit();
        }

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer,(DrawerLayout)findViewById(R.id.drawer_layout), toolbar);
        //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

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

        if(id== R.id.navigate){
            startActivity(new Intent(this, SubActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }


}
