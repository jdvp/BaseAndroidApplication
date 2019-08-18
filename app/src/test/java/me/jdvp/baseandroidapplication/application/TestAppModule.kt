package me.jdvp.baseandroidapplication.application


import dagger.Module
import me.jdvp.baseandroidapplication.viewmodel.impl.TestViewModelModule

/**
 * Test module that mirrors AppModule but mocks the dependencies
 *
 * Created by jdvp on 6/19/18.
 */
@Module(includes = [TestViewModelModule::class])
internal class TestAppModule
