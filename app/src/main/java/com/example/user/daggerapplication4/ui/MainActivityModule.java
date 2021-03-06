package com.example.user.daggerapplication4.ui;

import com.example.user.daggerapplication4.Models.OyuncakBebek;
import com.example.user.daggerapplication4.Models.Puzzle;
import com.example.user.daggerapplication4.Models.Toy;
import com.example.user.daggerapplication4.di.ActivityScoped;
import com.example.user.daggerapplication4.di.FragmentScoped;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the

 */
@Module()
public abstract class MainActivityModule {
    @FragmentScoped
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment bindMainFragment();
}
