package me.jdvp.baseandroidapplication.service

import me.jdvp.baseandroidapplication.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Utility class used to create retrofit service classes
 */
internal object ServiceCreator {
    /**
     * Creates a service using the base url
     *
     * @param service The class of the service type we want to instantiate
     * @param <T> The the service type
     * @return  An instance of the service
    </T> */
    @JvmStatic
    fun <T> createService(service: Class<T>): T {
        val logging = HttpLoggingInterceptor()

        //Add logging to see request and response data in debug build
        if (BuildConfig.DEBUG) {
            logging.level = HttpLoggingInterceptor.Level.BODY
        } else {
            logging.level = HttpLoggingInterceptor.Level.NONE
        }

        val httpClientBuilder = OkHttpClient.Builder().addInterceptor(logging)
        val builder = Retrofit.Builder()
        builder.client(httpClientBuilder.build())
        builder.baseUrl(BuildConfig.BASE_RETROFIT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
        return builder.build().create(service)
    }
}
