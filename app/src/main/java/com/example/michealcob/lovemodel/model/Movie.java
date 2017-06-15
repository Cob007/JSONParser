package com.example.michealcob.lovemodel.model;

/**
 * Created by michealcob on 5/14/17.
 */

public class Movie {
    private String imageUrl;
    private String title;
    private String description;
    private String userRating;
    private String releaseDate;
    private String language;
    private String imageUrlText;


    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getUserRating() {
        return userRating;
    }

    public String getLanguage() {
        return language;
    }

    public void setImageUrlText(String imageUrlText) {
        this.imageUrlText = imageUrlText;
    }

    public String getImageUrlText() {
        return imageUrlText;
    }
}
