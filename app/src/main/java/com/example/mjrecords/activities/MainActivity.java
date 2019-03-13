package com.example.mjrecords.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.mjrecords.R;
import com.example.mjrecords.adapter.TrackAdapter;
import com.example.mjrecords.model.Results;
import com.example.mjrecords.network.ApiClient;
import com.example.mjrecords.network.NukeSSLCerts;
import com.example.mjrecords.utils.ParseUtils;
import com.example.mjrecords.utils.Utils;
import com.google.gson.JsonSyntaxException;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity implements TrackAdapter.Listener {
    private RecyclerView recyclerViewTracks;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        recyclerViewTracks = findViewById(R.id.track_recycler_view);
        recyclerViewTracks.setItemAnimator(new DefaultItemAnimator());
        fetchMJTracks();
    }


    private void fetchMJTracks() {
        JsonObjectRequest tracksRequests = new JsonObjectRequest(Request.Method.GET, Utils.trackURL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    disableProgressDialog();
                    setAdapter(ParseUtils.getInstance().parseResult(response));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            protected Response<JSONObject> parseNetworkResponse(NetworkResponse response) {
                return super.parseNetworkResponse(response);
            }

            @Override
            public String getBodyContentType() {
                return "application/json";
            }

            @Override
            public Request<?> setRetryPolicy(RetryPolicy retryPolicy) {
                retryPolicy = new DefaultRetryPolicy(60000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                return super.setRetryPolicy(retryPolicy);
            }
        };
        NukeSSLCerts.nuke();
        tracksRequests.setShouldCache(false);
        ApiClient.getInstance().addToRequestqueue(tracksRequests);
        enableProgressDialog();
    }

    private void enableProgressDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Please Wait...");
        progressDialog.show();
    }

    private void disableProgressDialog() {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }

    private void setAdapter(List<Results> results) {
        try {

            TrackAdapter adapter = new TrackAdapter(results, this);
            recyclerViewTracks.setAdapter(adapter);
            Log.e("setAdapter: ", results.toString());
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onChildClick(Results results) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("trackData", results);
        Intent intent = new Intent(MainActivity.this, TrackDetails.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
