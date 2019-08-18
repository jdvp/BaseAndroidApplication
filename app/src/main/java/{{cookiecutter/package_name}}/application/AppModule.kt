package {{cookiecutter.package_name}}.application

import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import {{cookiecutter.package_name}}.viewmodel.impl.ViewModelModule
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
