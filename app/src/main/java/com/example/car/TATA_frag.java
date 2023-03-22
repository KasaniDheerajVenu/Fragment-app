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

import java.time.temporal.Temporal;

public class TATA_frag extends Fragment {
    View view;
    ImageView im;
    Button b1,b2,b3,b4;
    TextView t;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.layout_tata,container,false);
        im=view.findViewById(R.id.imageView3);
        b1=view.findViewById(R.id.gcls);
        b2=view.findViewById(R.id.eqs);
        b3=view.findViewById(R.id.glc);
        b4=view.findViewById(R.id.scls);
        t=view.findViewById(R.id.textView5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.tata_altroz);
                t.setText("ALTROZ");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.tata_punch);
                t.setText("PUNCH");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.tata_nexon);
                t.setText("NEXON");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.tataharrier);
                t.setText("HARRIER");
            }
        });
        return  view;
    }
}
