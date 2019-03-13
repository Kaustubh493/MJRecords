package com.example.mjrecords.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mjrecords.R;
import com.example.mjrecords.model.Results;
import com.example.mjrecords.network.ApiClient;
import com.squareup.picasso.Picasso;

public class TrackDetails extends AppCompatActivity {

    private TextView txt_songname;
    private TextView txt_artistname;
    private TextView txt_releasedate;
    private TextView txt_genre;
    private TextView txt_country;
    private TextView txt_price;
    private ImageView artist_imageView;
    private Results results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_details);
        Bundle bundle = getIntent().getExtras();

        try {
            if (bundle != null) {
                if (bundle.containsKey("trackData")) {
                    results = bundle.getParcelable("trackData");
                }

            }
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        txt_songname = findViewById(R.id.txt_songname);
        txt_artistname = findViewById(R.id.txt_artistname);
        txt_releasedate = findViewById(R.id.txt_releasedate);
        txt_genre = findViewById(R.id.txt_genre);
        txt_country = findViewById(R.id.txt_country);
        txt_price = findViewById(R.id.txt_price);
        artist_imageView = findViewById(R.id.artist_imageView);

        if (!TextUtils.isEmpty(results.getArtworkUrl100())) {
            Uri uri = Uri.parse(results.getArtworkUrl100());
            Picasso.with(ApiClient.getInstance().getApplicationContext()).load(uri).resize(200,100).into(artist_imageView);
        }
        txt_songname.setText(results.getTrackName());
        txt_artistname.setText(results.getArtistName());
        txt_releasedate.setText(results.getReleaseDate());
        txt_genre.setText(results.getPrimaryGenreName());
        txt_country.setText(results.getCountry());
        txt_price.setText(results.getTrackPrice());
    }
}
