package com.example.music_player;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.text.BreakIterator;
import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder>{

    private Context context;
    private List<Songs> allSongs;

    public SongAdapter(Context context, List<Songs> allSongs) {
        this.allSongs = allSongs;
        this.context = context;
    }



    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.song_layout,parent,false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder( SongViewHolder holder, int position) {
        Songs mSong = allSongs.get(position);
        holder.songTitle.setText(mSong.getSongTitle());
        holder.songAuthor.setText(mSong.getSongAuthor());
        String imagePath = Helper.ImageURL+"images/"+mSong.getSongImage();
        Glide.with(context).load(imagePath).fitCenter().into(holder.songImage);

    }

    @Override
    public int getItemCount() {

        return allSongs.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder{


        private TextView songTitle;
        private TextView songAuthor;
        private ImageView songImage;

        public SongViewHolder(View itemView) {

            super(itemView);
            songTitle = itemView.findViewById(R.id.song_name);
            songAuthor=itemView.findViewById(R.id.song_author);
            songImage=itemView.findViewById(R.id.song_image);
        }
    }
}
