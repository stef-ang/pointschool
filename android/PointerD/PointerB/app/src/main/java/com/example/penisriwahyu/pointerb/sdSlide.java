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


public class sdSlide extends ActionBarActivity {
    private Toolbar toolbar;
    private ViewPager mPager;
    private SlidingTabLayout mTabs;
    private int number;
    public int id_kelas = 1;
    public int id_mapel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd_slide);

        toolbar = (Toolbar) findViewById(R.id.app_bar2);
        setSupportActionBar(toolbar);


        Intent intent = getIntent();
        Bundle bund = intent.getExtras();
        if(bund != null){
            this.number = bund.getInt("NoMapel");
            if(number == 0){
                sdSlide.this.setTitle("Matematika SD");
                this.id_mapel =0;
            }
            else if(number == 1){
                sdSlide.this.setTitle("IPA SD");
                this.id_mapel =1;
            }
            else if(number == 2){
                sdSlide.this.setTitle("IPS SD");
                this.id_mapel =2;
            }
            else if(number == 3){
                sdSlide.this.setTitle("Bahasa Indonesia SD");
                this.id_mapel =3;
            }
            else if(number == 4){
                sdSlide.this.setTitle("Bahasa Inggris SD");
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
        getMenuInflater().inflate(R.menu.menu_sd_slide, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class MyPagerAdapter extends FragmentPagerAdapter{

        String[] tabs;
        int id_mapel;

        public MyPagerAdapter(FragmentManager fm, int id_mapel) {
            super(fm);

            this.id_mapel = id_mapel;
            tabs=getResources().getStringArray(R.array.tabs);
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
            return 6;
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

            layout =inflater.inflate(R.layout.fragment_my,(ViewGroup) this.getView(), true);
            rel = (LinearLayout) layout.findViewById(R.id.linearLayout);

            rel.setPadding(10,10,10,10);
            if(bundle.getInt("id_mapel") == 0){
                DatabaseHandler db = new DatabaseHandler(getActivity().getApplicationContext());
                babs = db.getBab(bundle.getInt("position") + 1 ,"Matematika");
                for (int i = 0;i < babs.size();i++){
                    createBtn(babs.get(i).getNamaBab(),babs.get(i).getIdBab());
                }
            }
            else if(bundle.getInt("id_mapel") == 1){
                DatabaseHandler db = new DatabaseHandler(getActivity().getApplicationContext());
                babs = db.getBab(bundle.getInt("position") + 1,"Ilmu Pengetahuan Alam");
                for (int i = 0;i < babs.size();i++){
                    createBtn(babs.get(i).getNamaBab(),babs.get(i).getIdBab());
                }
            }
            else if(bundle.getInt("id_mapel") == 2){
                DatabaseHandler db = new DatabaseHandler(getActivity().getApplicationContext());
                babs = db.getBab(bundle.getInt("position") + 1,"Ilmu Pengetahuan Sosial");
                for (int i = 0;i < babs.size();i++){
                    createBtn(babs.get(i).getNamaBab(),babs.get(i).getIdBab());
                }
            }
            else if(bundle.getInt("id_mapel") == 3){
                DatabaseHandler db = new DatabaseHandler(getActivity().getApplicationContext());
                babs = db.getBab(bundle.getInt("position") + 1,"Bahasa Indonesia");
                for (int i = 0;i < babs.size();i++){
                    createBtn(babs.get(i).getNamaBab(),babs.get(i).getIdBab());
                }
            }
            else if(bundle.getInt("id_mapel") == 4){
                DatabaseHandler db = new DatabaseHandler(getActivity().getApplicationContext());
                babs = db.getBab(bundle.getInt("position") + 1,"Bahasa Inggris");
                for (int i = 0;i < babs.size();i++){
                    createBtn(babs.get(i).getNamaBab(),babs.get(i).getIdBab());
                }
            }
            return layout;
        }

        public void createBtn(final String nama_bab, final int id_bab){
            Button button = new Button(getActivity());
            button.setText(nama_bab);
            button.setTextSize(18);
            button.setBackground(getResources().getDrawable(R.drawable.btn_state_sd));
            button.setTextColor(Color.parseColor("#000000"));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(10, 10, 10, 10);

            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent i = new Intent(getActivity(), subBabView.class);
                    Bundle arg = new Bundle();
                    arg.putInt("id_bab",id_bab);
                    arg.putString("nama_bab",nama_bab);
                    i.putExtras(arg);
                    startActivity(i);
                }
            });

            rel.addView(button, params);
        }
    }
}
