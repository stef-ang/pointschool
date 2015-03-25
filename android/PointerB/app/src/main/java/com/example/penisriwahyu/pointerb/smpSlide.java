package com.example.penisriwahyu.pointerb;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.penisriwahyu.pointerb.Model.Bab;
import com.example.penisriwahyu.pointerb.Model.Mapel;
import com.example.penisriwahyu.pointerb.tabs.SlidingTabLayout;

import java.util.List;


public class smpSlide extends ActionBarActivity {
    private Toolbar toolbar;
    private ViewPager mPager;
    private SlidingTabLayout mTabs;
    private int number;
    public int id_kelas = 1;
    public int id_mapel = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smp_slide);

        toolbar = (Toolbar) findViewById(R.id.app_bar2);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Bundle bund = intent.getExtras();
        if(bund != null){
            this.number = bund.getInt("NoMapel");
            if(number == 0){
                smpSlide.this.setTitle("Matematika SMP");
                this.id_mapel =0;
            }
            else if(number == 1){
                smpSlide.this.setTitle("Biologi SMP");
                this.id_mapel =1;
            }
            else if(number == 2){
                smpSlide.this.setTitle("Fisika SMP");
                this.id_mapel =2;
            }
            else if(number == 3){
                smpSlide.this.setTitle("Kimia SMP");
                this.id_mapel =3;
            }
            else if(number == 4){
                smpSlide.this.setTitle("Ilmu Pengetahuan Sosial SMP");
                this.id_mapel = 4;
            }
        }
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), number));
        mTabs = (SlidingTabLayout) findViewById(R.id.tabs);
        mTabs.setViewPager(mPager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_smp_slide, menu);
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
    class MyPagerAdapter extends FragmentPagerAdapter {

        String[] tabs;
        int id_mapel;

        public MyPagerAdapter(FragmentManager fm, int id_mapel) {
            super(fm);

            this.id_mapel = id_mapel;
            tabs=getResources().getStringArray(R.array.tabsSMP);
        }

        @Override
        public Fragment getItem(int position) {
            MyFragment myFragment = MyFragment.getInstance(position, this.id_mapel);
            return myFragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    public static class MyFragment extends Fragment{
        private TextView textView;
        private LinearLayout rel;
        private String[] panel1;
        private View layout;
        private Button but1;
        private static int id_kelas;
        List<Bab> babs;
        List<Mapel> mapels;
        private TextView tv;

        public static MyFragment getInstance(int position, int mapel){
            MyFragment myFragment= new MyFragment();
            Bundle args = new Bundle();
            args.putInt("position", position);
            args.putInt("id_mapel",mapel);
            myFragment.setArguments(args);
            return myFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
            Bundle bundle = getArguments();
            boolean ever = false;
            DatabaseHandler db = new DatabaseHandler(getActivity().getApplicationContext());
            babs = db.getAllBab();
            mapels = db.getAllMapel();

            layout =inflater.inflate(R.layout.fragment_my,(ViewGroup) this.getView(), true);
            rel = (LinearLayout) layout.findViewById(R.id.linearLayout);
            int idMapel = 0;
            rel.setPadding(10,10,10,10);

            if(bundle.getInt("id_mapel") == 0 && bundle.getInt("position")==0 ){
                for (int i = 0; i < mapels.size();i++){
                    if (mapels.get(i).getNamaMapel().equals("Matematika")){
                        idMapel = mapels.get(i).getIdMapel();
                    }
                }
                //looping button
                for (int i = 0;i < babs.size();i++){
                    if (babs.get(i).getIdMapel() == idMapel && babs.get(i).getIdKelas() == 1) {
                        Log.d("PENI PENI PENI", "-------------" + babs.get(i).getNamaBab());
                        Button button = new Button(getActivity());
                        button.setText(babs.get(i).getNamaBab());
                        button.setTextSize(18);
                        button.setBackground(getResources().getDrawable(R.drawable.btn_state));
                        button.setTextColor(Color.parseColor("#000000"));
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );
                        params.setMargins(10, 10, 10, 10);



                        rel.addView(button, params);
                    }
                }
            }
            else if(bundle.getInt("id_mapel") == 0 && bundle.getInt("position")==1 ){
                for (int i = 0; i < mapels.size();i++){
                    if (mapels.get(i).getNamaMapel().equals("Matematika")){
                        idMapel = mapels.get(i).getIdMapel();
                    }
                }
                for (int i = 0;i < babs.size();i++){
                    if (babs.get(i).getIdMapel() == idMapel && babs.get(i).getIdKelas() == 2) {
                        Button button = new Button(getActivity());
                        button.setText(babs.get(i).getNamaBab());
                        button.setTextSize(18);
                        button.setBackground(getResources().getDrawable(R.drawable.btn_state));
                        button.setTextColor(Color.parseColor("#000000"));
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );
                        params.setMargins(10, 10, 10, 10);
                        rel.addView(button, params);
                    }
                }
            }
            else{

            }

            return layout;
        }
    }
}
