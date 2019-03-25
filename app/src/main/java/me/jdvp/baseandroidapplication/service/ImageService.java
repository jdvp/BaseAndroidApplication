package me.jdvp.baseandroidapplication.service;

import io.reactivex.Observable;
import me.jdvp.baseandroidapplication.model.ImageList;
import retrofit2.http.GET;

public interface ImageService {
    @GET("/img")
    Observable<ImageList> getImages();
}
