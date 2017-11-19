package com.example.c4q.inclassjose.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.c4q.inclassjose.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private EditText eMain;
    private View rootView;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        button01=(Button) rootView.findViewById(R.id.button01);
        button02=(Button) rootView.findViewById(R.id.button02);
        button03=(Button) rootView.findViewById(R.id.button03);
        button04=(Button) rootView.findViewById(R.id.button04);
        button05=(Button) rootView.findViewById(R.id.button05);
        eMain=(EditText) rootView.findViewById(R.id.main_fragment_edittext);
        rootView=inflater.inflate(R.layout.fragment_main, container, false);
        // Inflate the layout for this fragment
        // settiing on clicks
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne fragmentOne= new FragmentOne();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

                String textFromEditText= eMain.getText().toString();

                Bundle bundle= new Bundle();
                bundle.putString("random", textFromEditText);
                fragmentOne.setArguments(bundle);
                fragmentTransaction.replace(R.id.frame_fragment,fragmentOne).addToBackStack("random");
                fragmentTransaction.commit();

            }
        });
        return  rootView;
    }

}
