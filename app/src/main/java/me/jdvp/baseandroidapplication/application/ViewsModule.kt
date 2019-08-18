package me.jdvp.baseandroidapplication.application

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.jdvp.baseandroidapplication.activity.MainActivity

/**
 * Module that defines which views will be injected
 */
@Module
internal abstract class ViewsModule {
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
}