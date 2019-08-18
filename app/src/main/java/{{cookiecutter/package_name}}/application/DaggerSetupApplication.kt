package {{cookiecutter.package_name}}.application

import com.squareup.picasso.OkHttpDownloader
import com.squareup.picasso.Picasso
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import {{cookiecutter.package_name}}.BuildConfig

/**
 * Application class used for setting up Dagger
 */

class DaggerSetupApplication : DaggerApplication() {
    override fun onCreate() {
        super.onCreate()
        setupPicasso()
    }

    override fun applicationInjector(): AndroidInjector<DaggerSetupApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    private fun setupPicasso() {
        val builder = Picasso.Builder(this)
        builder.downloader(OkHttpDownloader(this, MAX_DISK_CACHE_SIZE.toLong()))
        val built = builder.build()

        if (BuildConfig.DEBUG) {
            built.setIndicatorsEnabled(true)
            built.isLoggingEnabled = true
        }
        Picasso.setSingletonInstance(built)
    }

    companion object {
        private const val MAX_DISK_CACHE_SIZE = 32 * 1024 * 1024 // 32MB
    }
}