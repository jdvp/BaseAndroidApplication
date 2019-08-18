package me.jdvp.baseandroidapplication.application

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.jdvp.baseandroidapplication.activity.MainActivity
import me.jdvp.baseandroidapplication.fragment.MainFragment

/**
 * Module that defines which views will be injected
 */
@Module
internal abstract class ViewsModule {
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}