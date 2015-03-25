package com.example.penisriwahyu.pointerb;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    public int nomor = 0;
    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Button but = (Button) view.findViewById(R.id.sd);
        but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getActivity(), SubActivity2.class);
                startActivity(i);
            }
        });

        Button butsmp = (Button) view.findViewById(R.id.smp);
        butsmp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), SubActivitySMP.class));
            }
        });

        Button butsma = (Button) view.findViewById(R.id.sma);
        butsma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), SubActivitySMA.class));
            }
        });


        return view;
    }
}
