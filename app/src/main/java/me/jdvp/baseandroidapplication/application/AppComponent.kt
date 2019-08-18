package me.jdvp.baseandroidapplication.application

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
 * Component used to define the dependency modules that are used in the application
 */

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AppModule::class,
            ViewsModule::class
        ]
)
interface AppComponent : AndroidInjector<DaggerSetupApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerSetupApplication>()
}