package com.example.mjrecords.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TrackModel implements Serializable, Parcelable {

    @Expose
    @SerializedName("results")
    private List<Results> results;
    @Expose
    @SerializedName("resultCount")
    private int resultCount;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.results);
        dest.writeInt(this.resultCount);
    }

    public TrackModel() {
    }

    protected TrackModel(Parcel in) {
        this.results = new ArrayList<Results>();
        in.readList(this.results, Results.class.getClassLoader());
        this.resultCount = in.readInt();
    }

    public static final Creator<TrackModel> CREATOR = new Creator<TrackModel>() {
        @Override
        public TrackModel createFromParcel(Parcel source) {
            return new TrackModel(source);
        }

        @Override
        public TrackModel[] newArray(int size) {
            return new TrackModel[size];
        }
    };
}
