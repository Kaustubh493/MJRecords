package com.example.mjrecords.adapter;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mjrecords.R;
import com.example.mjrecords.model.Results;
import com.example.mjrecords.network.ApiClient;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.List;

public class TrackAdapter extends RecyclerView.Adapter<TrackAdapter.ViewHolder> {
    private Listener listener;
    private List<Results> resultsList;
    private boolean isPlaying = false;

    public TrackAdapter(List<Results> resultsList, Listener listener) {
        this.listener = listener;
        this.resultsList = resultsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tracks_list_row_item,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final Results trackModel = resultsList.get(i);
        if (!TextUtils.isEmpty(trackModel.getArtworkUrl100())) {
            Uri uri = Uri.parse(trackModel.getArtworkUrl100());
            Picasso.with(ApiClient.getInstance().getApplicationContext()).load(uri).resize(80, 60).into(viewHolder.trackImage);
        }

        if (!TextUtils.isEmpty(trackModel.getTrackName())) {
            viewHolder.trackName.setText(trackModel.getTrackName());
        } else {
            viewHolder.trackName.setText("");
        }
        if (!TextUtils.isEmpty(trackModel.getArtistName())) {
            viewHolder.artistName.setText(trackModel.getArtistName());
        } else {
            viewHolder.artistName.setText("");
        }
        if (trackModel.getCollectionName() != null) {
            if (!TextUtils.isEmpty(trackModel.getCollectionName())) {
                viewHolder.collectionName.setText(trackModel.getCollectionName());
            } else {
                viewHolder.collectionName.setText("");
            }
        }
        viewHolder.trackCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onChildClick(resultsList.get(viewHolder.getAdapterPosition()));
            }
        });
        viewHolder.trackImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                if (!isPlaying) {
                    isPlaying = true;
                    try {
                        mediaPlayer.reset();

                        mediaPlayer.setDataSource(ApiClient.getInstance().getApplicationContext(), Uri.parse(trackModel.getPreviewUrl()));
                        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mp) {
                                mp.start();
                            }
                        });
                        mediaPlayer.prepareAsync();



                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else {
                    isPlaying = false;

                    if (mediaPlayer != null) {
                        mediaPlayer.reset();
                       }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView trackImage;
        TextView trackName;
        TextView artistName;
        TextView collectionName;
        CardView trackCardview;


        ViewHolder(View view) {
            super(view);
            trackImage = view.findViewById(R.id.track_cover_image);
            trackName = view.findViewById(R.id.track_name);
            artistName = view.findViewById(R.id.artist_name);
            collectionName = view.findViewById(R.id.collectionName);
            trackCardview = view.findViewById(R.id.track_view_card);
        }
    }

    public interface Listener {
        void onChildClick(Results results);
    }
}
