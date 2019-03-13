package com.example.mjrecords.utils;


import android.util.Log;

import com.example.mjrecords.model.Results;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParseUtils {

    public static ParseUtils getInstance() {
        return new ParseUtils();
    }

    public List<Results> parseResult(JSONObject jsonObject) throws JSONException {
        List<Results> resultsList = null;
        try {
            JSONArray jsonArray = jsonObject.getJSONArray("results");
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            resultsList = gson.fromJson(jsonArray.toString(), new TypeToken<List<Results>>() {
            }.getType());
            Collections.sort(resultsList, new Comparator<Results>() {
                @Override
                public int compare(Results o1, Results o2) {
                    return o1.getTrackName().compareTo(o2.getTrackName());
                }
            });
        } catch (JSONException e) {
            throw e;
        }
        return resultsList;

    }
}
