package {{cookiecutter.package_name}}.application

import dagger.Module
import dagger.android.ContributesAndroidInjector
import {{cookiecutter.package_name}}.activity.MainActivity
import {{cookiecutter.package_name}}.fragment.MainFragment

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