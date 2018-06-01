package com.example.user.daggerapplication4.di;

import com.example.user.daggerapplication4.DaggerSample4Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by user on 11.04.2018.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class
})
public interface AppComponent extends AndroidInjector<DaggerSample4Application> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<DaggerSample4Application> {}
}
