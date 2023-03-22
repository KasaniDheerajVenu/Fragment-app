package com.example.car;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BENZ_frag extends Fragment {
    View view;
    ImageView im;
    Button b1,b2,b3,b4;
    TextView t1;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.layout_benz,container,false);
        im=view.findViewById(R.id.imageView4);
        b1=view.findViewById(R.id.gcls);
        b2=view.findViewById(R.id.scls);
        b3=view.findViewById(R.id.eqs);
        b4=view.findViewById(R.id.glc);
        t1=view.findViewById(R.id.textView4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.mercedes_g_class);
                t1.setText("mercedes benz g class");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.mercedes_benz_s_class);
                t1.setText("mercedes benz s class");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.mercedes_benz_eqs);
                t1.setText("mercedes benz eqs");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.glc);
                t1.setText("mercedes benz glc");
            }
        });
        return view;
    }
}
