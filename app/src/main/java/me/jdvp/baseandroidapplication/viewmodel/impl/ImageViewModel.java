package me.jdvp.baseandroidapplication.viewmodel.impl;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jdvp.baseandroidapplication.model.ImageList;
import me.jdvp.baseandroidapplication.service.ImageService;

public class ImageViewModel {

    private ImageService imageService;

    public ImageViewModel(ImageService imageService) {
        this.imageService = imageService;
    }

    public Observable<ImageList> getImages() {
        return imageService.getImages()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
