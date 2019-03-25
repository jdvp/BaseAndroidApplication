package me.jdvp.baseandroidapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Objects;

public class ImageList {

    @Expose
    @SerializedName("images")
    private ArrayList<Image> images = new ArrayList<>();


    public ArrayList<Image> getImages() {
        return images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageList imageList = (ImageList) o;
        return Objects.equals(images, imageList.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(images);
    }
}