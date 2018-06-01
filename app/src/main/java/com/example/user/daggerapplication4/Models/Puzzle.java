package com.example.user.daggerapplication4.Models;

import android.util.Log;

import com.example.user.daggerapplication4.di.FragmentScoped;

import javax.inject.Inject;

import dagger.multibindings.IntoSet;

/**
 * Created by user on 8.04.2018.
 */
public class Puzzle implements Toy {

    @Inject
    public Puzzle()
    {

    }

    @Override
    public String play() {
        Log.v("DaggerSample","Play with Puzzle");
        return "Play with Puzzle";
    }
}
