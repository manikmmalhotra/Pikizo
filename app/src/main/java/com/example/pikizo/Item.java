package com.example.pikizo;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("wallpapers")
    @Expose
    private List<Wallpaper> wallpapers = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Wallpaper> getWallpapers() {
        return wallpapers;
    }

    public void setWallpapers(List<Wallpaper> wallpapers) {
        this.wallpapers = wallpapers;
    }

}

class Wallpaper {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("file_type")
    @Expose
    private String fileType;
    @SerializedName("file_size")
    @Expose
    private String fileSize;
    @SerializedName("url_image")
    @Expose
    private String urlImage;
    @SerializedName("url_thumb")
    @Expose
    private String urlThumb;
    @SerializedName("url_page")
    @Expose
    private String urlPage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlThumb() {
        return urlThumb;
    }

    public void setUrlThumb(String urlThumb) {
        this.urlThumb = urlThumb;
    }

    public String getUrlPage() {
        return urlPage;
    }

    public void setUrlPage(String urlPage) {
        this.urlPage = urlPage;
    }

}