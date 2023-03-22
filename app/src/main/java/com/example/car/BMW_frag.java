package com.example.car;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BMW_frag extends Fragment {
    View view;
    Button b1,b2,b3,b4;
    ImageView im;
    TextView t;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.layout_bmw,container,false);
        im=view.findViewById(R.id.imageView2);
        b1=view.findViewById(R.id.gcls);
        b2=view.findViewById(R.id.eqs);
        b3=view.findViewById(R.id.scls);
        b4=view.findViewById(R.id.glc);
        t=view.findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.bmw_m4);
                t.setText("BMW M4");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.bmw_m8);
                t.setText("BMW M8");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.bmw_z4m40i);
                t.setText("BMW Z4M40I");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.bmw_m340i);
                t.setText("BMW M340I");
            }
        });
        return view;
    }
}
