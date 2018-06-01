package com.example.user.daggerapplication4.di;

import com.example.user.daggerapplication4.ui.MainActivity;
import com.example.user.daggerapplication4.ui.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by user on 11.04.2018.
 */

@Module
public abstract class ActivityBuilder {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}
