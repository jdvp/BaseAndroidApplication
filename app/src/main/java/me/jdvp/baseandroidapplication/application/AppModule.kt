package me.jdvp.baseandroidapplication.application

import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import me.jdvp.baseandroidapplication.viewmodel.impl.ViewModelModule
import javax.inject.Singleton

/**
 * Module that defines app-wide dependencies that aren't ViewModels
 */
@Module(includes = [ViewModelModule::class])
class AppModule {
    @Provides
    @Singleton
    fun provideSharedPreferences(application: DaggerSetupApplication) : SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }
}
