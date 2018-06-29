package me.jdvp.baseandroidapplication.service;

import me.jdvp.baseandroidapplication.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Utility class used to create retrofit service classes
 *
 * Created by jdvp on 6/18/18.
 */
class ServiceCreator {
    /**
     * Creates a service using the base url
     *
     * @param service The class of the service type we want to instantiate
     * @param <T> The the service type
     * @return  An instance of the service
     */
    static <T> T createService (Class<T> service) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

        //Add logging to see request and response data in debug build
        if (BuildConfig.DEBUG) {
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            logging.setLevel(HttpLoggingInterceptor.Level.NONE);
        }

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder().addInterceptor(logging);
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(httpClientBuilder.build());
        builder.baseUrl(BuildConfig.BASE_RETROFIT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync());
        return builder.build().create(service);
    }
}
