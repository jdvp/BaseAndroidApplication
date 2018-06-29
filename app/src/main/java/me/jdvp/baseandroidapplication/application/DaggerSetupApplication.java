package me.jdvp.baseandroidapplication.application;

import android.content.Context;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * Application class used for setting up Dagger
 *
 * Created by jdvp on 6/18/18.
 */

public class DaggerSetupApplication extends DaggerApplication {
    private static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this.getApplicationContext();
    }

    @Override
    public AndroidInjector<DaggerSetupApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

    public static Context getApplicationContextInstance() {
        return applicationContext;
    }
}
