package me.jdvp.baseandroidapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Image implements Serializable {

    @Expose
    @SerializedName("_id")
    private String id;

    @Expose
    @SerializedName("img")
    private String img;

    @Expose
    @SerializedName("date")
    private Date date;

    @Expose
    @SerializedName("user")
    private String user;

    @Expose
    @SerializedName("caption")
    private String caption;


    public String getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public Date getDate() {
        return date;
    }

    public String getUrl() {
        return img;
    }

    public String getUser() {
        return user;
    }

    public String getCaption() {
        return caption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(id, image.id) &&
                Objects.equals(img, image.img) &&
                Objects.equals(date, image.date) &&
                Objects.equals(user, image.user) &&
                Objects.equals(caption, image.caption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, img, date, user, caption);
    }
}