package com.example.user.daggerapplication4.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.daggerapplication4.Models.Toy;
import com.example.user.daggerapplication4.R;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * Created by user on 11.04.2018.
 */

public class MainFragment extends DaggerFragment {
    private Button btnBuy;
    private TextView textResult;

    @Inject
    Toy toy;


    @Inject
    public MainFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        btnBuy = root.findViewById(R.id.btnBuy);
        textResult = root.findViewById(R.id.textRresult);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMessage(toy.play());
            }
        });

        return root;
    }

    public void showMessage(String message) {
        textResult.setText(message);
    }
}
