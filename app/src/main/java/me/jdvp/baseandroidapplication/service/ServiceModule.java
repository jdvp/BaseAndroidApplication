package me.jdvp.baseandroidapplication.service;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Module used for providing services
 *
 * Created by jdvp on 6/18/18.
 */
@Module
public class ServiceModule {
    @Provides
    @Singleton
    public ImageService providesImageService() {
        return ServiceCreator.createService(ImageService.class);
    }
}
