package com.example.car;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AUDI_frag extends Fragment {

    View view;
    ImageView im;
    Button b1,b2,b3,b4;
    TextView t;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment

        view = inflater.inflate(R.layout.layout_audi, container, false);
        im=(ImageView) view.findViewById(R.id.imageView);
        b1=(Button) view.findViewById(R.id.gcls);
        b2=(Button) view.findViewById(R.id.glc);
        b3=(Button) view.findViewById(R.id.scls);
        b4=(Button) view.findViewById(R.id.eqs);
        t=view.findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.audi_a6);
                t.setText("AUDI A6");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.audi_a4);
                t.setText("AUDI A4");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.audi_rs5);
                t.setText("AUDI RS 5");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.audi_a8l);
                t.setText("AUDI A8L");
            }
        });
        return view;
    }
}
