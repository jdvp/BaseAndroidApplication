package me.jdvp.baseandroidapplication.application

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.jdvp.baseandroidapplication.activity.MainActivityTest
import javax.inject.Singleton

/**
 * Test App component used for replacing injected members with mocks for Robolectric testing.
 * Also serves to inject actual Robolectric test classes
 *
 * Created by jdvp on 6/19/18.
 */
@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, TestAppModule::class, ViewsModule::class])
interface TestAppComponent : AndroidInjector<DaggerSetupApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerSetupApplication>()

    fun inject(mainActivityTest: MainActivityTest)
}