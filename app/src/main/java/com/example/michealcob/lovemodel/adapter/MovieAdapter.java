package com.example.michealcob.lovemodel.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.michealcob.lovemodel.R;
import com.example.michealcob.lovemodel.model.Movie;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by michealcob on 5/14/17.
 */

public class MovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private static final String TAG = "Image Url: ";
    private Context context;
    private LayoutInflater layoutInflater;
    public List<Movie> movies = Collections.emptyList();
    public static final String URL = "http://image.tmdb.org/t/p/w185/";

    public interface MovieAdpaterOnClickHandler{
        void onClick(String selectedMovie);
    }

    public MovieAdapter(Context _context, List<Movie> _movies){
        this.context = _context;
        layoutInflater = LayoutInflater.from(_context);
        this.movies = _movies;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_style, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //current position
        MyHolder myHolder = (MyHolder) holder;
        Movie currentMovie = movies.get(position);
        myHolder.date.setText(currentMovie.getReleaseDate());
        myHolder.description.setText(currentMovie.getDescription());
        myHolder.rating.setText(currentMovie.getUserRating());
        myHolder.title.setText(currentMovie.getTitle());
        //myHolder.imageUrlText.setText(currentMovie.getImageUrlText());

        /*
        * after getting the url i will add the link here
        * using picasso library
        * */
        String image_url = URL + currentMovie.getImageUrl();
        myHolder.imageUrlText.setText(image_url);
        Log.d(TAG, image_url);
        Picasso.with(context).load(image_url).into(myHolder.imageView);

    }

    @Override
    public int getItemCount() {
        if(null == movies) return 0;
        return this.movies.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView description;
        TextView date;
        TextView rating;
        TextView title;
        ImageView imageView;
        TextView imageUrlText;


        public MyHolder(View itemView) {
            super(itemView);
            //imageView = (ImageView) itemView.findViewById(R.id.iv_backDrop);
            imageUrlText = (TextView) itemView.findViewById(R.id.url);

        }
    }
}
