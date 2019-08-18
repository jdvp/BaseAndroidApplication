package me.jdvp.baseandroidapplication.application

import dagger.android.AndroidInjector

/**
 * Test application we use for Robolectric to ensure we can inject mocks into our activities
 * and tests (mostly for Robolectric tests)
 *
 * Created by jdvp on 6/19/18.
 */

class TestDaggerSetupApplication : DaggerSetupApplication() {
    internal var injector: AndroidInjector<DaggerSetupApplication>? = null

    val testAppComponent: TestAppComponent
        get() = applicationInjector() as TestAppComponent?

    override fun applicationInjector(): AndroidInjector<DaggerSetupApplication>? {
        if (injector == null) {
            injector = DaggerTestAppComponent.builder().create(this)
        }

        return injector
    }
}
