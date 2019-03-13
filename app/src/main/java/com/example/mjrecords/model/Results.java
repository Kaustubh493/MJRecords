package com.example.mjrecords.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Results implements Serializable, Parcelable {
    @Expose
    @SerializedName("isStreamable")
    private String isStreamable;
    @Expose
    @SerializedName("primaryGenreName")
    private String primaryGenreName;
    @Expose
    @SerializedName("currency")
    private String currency;
    @Expose
    @SerializedName("country")
    private String country;
    @Expose
    @SerializedName("trackTimeMillis")
    private String trackTimeMillis;
    @Expose
    @SerializedName("trackNumber")
    private String trackNumber;
    @Expose
    @SerializedName("trackCount")
    private String trackCount;
    @Expose
    @SerializedName("discNumber")
    private String discNumber;
    @Expose
    @SerializedName("discCount")
    private String discCount;
    @Expose
    @SerializedName("trackExplicitness")
    private String trackExplicitness;
    @Expose
    @SerializedName("collectionExplicitness")
    private String collectionExplicitness;
    @Expose
    @SerializedName("releaseDate")
    private String releaseDate;
    @Expose
    @SerializedName("trackPrice")
    private String trackPrice;
    @Expose
    @SerializedName("collectionPrice")
    private String collectionPrice;
    @Expose
    @SerializedName("artworkUrl100")
    private String artworkUrl100;
    @Expose
    @SerializedName("artworkUrl60")
    private String artworkUrl60;
    @Expose
    @SerializedName("artworkUrl30")
    private String artworkUrl30;
    @Expose
    @SerializedName("previewUrl")
    private String previewUrl;
    @Expose
    @SerializedName("trackViewUrl")
    private String trackViewUrl;
    @Expose
    @SerializedName("collectionViewUrl")
    private String collectionViewUrl;
    @Expose
    @SerializedName("artistViewUrl")
    private String artistViewUrl;
    @Expose
    @SerializedName("collectionArtistViewUrl")
    private String collectionArtistViewUrl;
    @Expose
    @SerializedName("collectionArtistName")
    private String collectionArtistName;
    @Expose
    @SerializedName("collectionArtistId")
    private String collectionArtistId;
    @Expose
    @SerializedName("trackCensoredName")
    private String trackCensoredName;
    @Expose
    @SerializedName("collectionCensoredName")
    private String collectionCensoredName;
    @Expose
    @SerializedName("trackName")
    private String trackName;
    @Expose
    @SerializedName("collectionName")
    private String collectionName;
    @Expose
    @SerializedName("artistName")
    private String artistName;
    @Expose
    @SerializedName("trackId")
    private String trackId;
    @Expose
    @SerializedName("collectionId")
    private String collectionId;
    @Expose
    @SerializedName("artistId")
    private String artistId;
    @Expose
    @SerializedName("kind")
    private String kind;
    @Expose
    @SerializedName("wrapperType")
    private String wrapperType;

    public String getIsStreamable() {
        return isStreamable;
    }

    public void setIsStreamable(String isStreamable) {
        this.isStreamable = isStreamable;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public void setTrackTimeMillis(String trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(String trackCount) {
        this.trackCount = trackCount;
    }

    public String getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(String discNumber) {
        this.discNumber = discNumber;
    }

    public String getDiscCount() {
        return discCount;
    }

    public void setDiscCount(String discCount) {
        this.discCount = discCount;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(String trackPrice) {
        this.trackPrice = trackPrice;
    }

    public String getCollectionPrice() {
        return collectionPrice;
    }

    public void setCollectionPrice(String collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getCollectionArtistViewUrl() {
        return collectionArtistViewUrl;
    }

    public void setCollectionArtistViewUrl(String collectionArtistViewUrl) {
        this.collectionArtistViewUrl = collectionArtistViewUrl;
    }

    public String getCollectionArtistName() {
        return collectionArtistName;
    }

    public void setCollectionArtistName(String collectionArtistName) {
        this.collectionArtistName = collectionArtistName;
    }

    public String getCollectionArtistId() {
        return collectionArtistId;
    }

    public void setCollectionArtistId(String collectionArtistId) {
        this.collectionArtistId = collectionArtistId;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.isStreamable);
        dest.writeString(this.primaryGenreName);
        dest.writeString(this.currency);
        dest.writeString(this.country);
        dest.writeString(this.trackTimeMillis);
        dest.writeString(this.trackNumber);
        dest.writeString(this.trackCount);
        dest.writeString(this.discNumber);
        dest.writeString(this.discCount);
        dest.writeString(this.trackExplicitness);
        dest.writeString(this.collectionExplicitness);
        dest.writeString(this.releaseDate);
        dest.writeString(this.trackPrice);
        dest.writeString(this.collectionPrice);
        dest.writeString(this.artworkUrl100);
        dest.writeString(this.artworkUrl60);
        dest.writeString(this.artworkUrl30);
        dest.writeString(this.previewUrl);
        dest.writeString(this.trackViewUrl);
        dest.writeString(this.collectionViewUrl);
        dest.writeString(this.artistViewUrl);
        dest.writeString(this.collectionArtistViewUrl);
        dest.writeString(this.collectionArtistName);
        dest.writeString(this.collectionArtistId);
        dest.writeString(this.trackCensoredName);
        dest.writeString(this.collectionCensoredName);
        dest.writeString(this.trackName);
        dest.writeString(this.collectionName);
        dest.writeString(this.artistName);
        dest.writeString(this.trackId);
        dest.writeString(this.collectionId);
        dest.writeString(this.artistId);
        dest.writeString(this.kind);
        dest.writeString(this.wrapperType);
    }

    public Results() {
    }

    protected Results(Parcel in) {
        this.isStreamable = in.readString();
        this.primaryGenreName = in.readString();
        this.currency = in.readString();
        this.country = in.readString();
        this.trackTimeMillis = in.readString();
        this.trackNumber = in.readString();
        this.trackCount = in.readString();
        this.discNumber = in.readString();
        this.discCount = in.readString();
        this.trackExplicitness = in.readString();
        this.collectionExplicitness = in.readString();
        this.releaseDate = in.readString();
        this.trackPrice = in.readString();
        this.collectionPrice = in.readString();
        this.artworkUrl100 = in.readString();
        this.artworkUrl60 = in.readString();
        this.artworkUrl30 = in.readString();
        this.previewUrl = in.readString();
        this.trackViewUrl = in.readString();
        this.collectionViewUrl = in.readString();
        this.artistViewUrl = in.readString();
        this.collectionArtistViewUrl = in.readString();
        this.collectionArtistName = in.readString();
        this.collectionArtistId = in.readString();
        this.trackCensoredName = in.readString();
        this.collectionCensoredName = in.readString();
        this.trackName = in.readString();
        this.collectionName = in.readString();
        this.artistName = in.readString();
        this.trackId = in.readString();
        this.collectionId = in.readString();
        this.artistId = in.readString();
        this.kind = in.readString();
        this.wrapperType = in.readString();
    }

    public static final Creator<Results> CREATOR = new Creator<Results>() {
        @Override
        public Results createFromParcel(Parcel source) {
            return new Results(source);
        }

        @Override
        public Results[] newArray(int size) {
            return new Results[size];
        }
    };
}
