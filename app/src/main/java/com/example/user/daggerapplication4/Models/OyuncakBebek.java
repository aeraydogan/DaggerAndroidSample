package com.example.user.daggerapplication4.Models;

import android.util.Log;

import com.example.user.daggerapplication4.di.FragmentScoped;

import javax.inject.Inject;

/**
 * Created by user on 8.04.2018.
 */

public class OyuncakBebek implements Toy {
    @Override
    public String play() {
        Log.v("DaggerSample3", "Play with OyuncakBebek");
        return "Play with OyuncakBebek";
    }
}
