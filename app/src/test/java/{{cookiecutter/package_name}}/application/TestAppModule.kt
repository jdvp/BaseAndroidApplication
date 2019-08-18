package {{cookiecutter.package_name}}.application


import dagger.Module
import {{cookiecutter.package_name}}.viewmodel.impl.TestViewModelModule

/**
 * Test module that mirrors AppModule but mocks the dependencies
 *
 * Created by jdvp on 6/19/18.
 */
@Module(includes = [TestViewModelModule::class])
internal class TestAppModule
