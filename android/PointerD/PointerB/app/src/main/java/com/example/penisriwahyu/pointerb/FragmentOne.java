package com.example.penisriwahyu.pointerb;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "ITCKRIST.ttf");

        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Button but = (Button) view.findViewById(R.id.sd);
        but.setTypeface(font);
        but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getActivity(), SubActivitySD.class);
                startActivity(i);
            }
        });

        Button butsmp = (Button) view.findViewById(R.id.smp);
        butsmp.setTypeface(font);
        butsmp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), SubActivitySMP.class));
            }
        });

        Button butsma = (Button) view.findViewById(R.id.sma);
        butsma.setTypeface(font);
        butsma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), SubActivitySMA.class));
            }
        });


        return view;
    }
}
