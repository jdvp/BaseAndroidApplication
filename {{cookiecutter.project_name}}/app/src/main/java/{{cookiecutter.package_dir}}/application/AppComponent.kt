package {{cookiecutter.package_name}}.application

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
interface AppComponent : AndroidInjector<{{cookiecutter.application_class_name}}> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<{{cookiecutter.application_class_name}}>()
}