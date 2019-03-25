package me.jdvp.baseandroidapplication.viewmodel.impl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jdvp.baseandroidapplication.service.ImageService;
import me.jdvp.baseandroidapplication.service.ServiceModule;

/**
 * Module that provides ViewModel dependencies. Also includes lower-level modules. In this case, we are including a module
 * for Services but if we wanted to also do caching, we might have another layer between the VM and services.
 *
 * Created by jdvp on 6/18/18.
 */

@Module(
        includes = {ServiceModule.class}
)
public class ViewModelModule {
    @Provides
    @Singleton
    ImageViewModel imageViewModel(ImageService imageService) {
        return new ImageViewModel(imageService);
    }
 }