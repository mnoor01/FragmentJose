package com.example.c4q.inclassjose.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.c4q.inclassjose.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
    private View rootView;
    private TextView text1;


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_fragment_one, container, false);
        // Inflate the layout for this fragment
        text1= (TextView) rootView.findViewById(R.id.txt01);
        Bundle bundle= getArguments();
        String textFRomEditText= bundle.getString("text","Nothing Passed");
        text1.setText(textFRomEditText);

        return rootView;
    }

}
