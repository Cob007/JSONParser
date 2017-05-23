package com.example.michealcob.lovemodel.utilities;



import com.example.michealcob.lovemodel.model.Movie;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michealcob on 5/14/17.
 */

public class JsonParser {

    public static List<Movie> parseMovie(JSONObject jsonResponse){
        List<Movie> movieList = new ArrayList<>();
        try{
            //JSONObject jsonObject = new JSONObject(jsonResponse);
            Movie movieClass = new Movie();
            JSONArray jsonArray = jsonResponse.getJSONArray("results");
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject obj = jsonArray.getJSONObject(i);
                movieClass.setTitle(obj.getString("original_title"));
                movieClass.setDescription(obj.getString("overview"));
                movieClass.setReleaseDate(obj.getString("release_date"));
                movieClass.setUserRating(obj.getString("vote_average"));
                movieClass.setImageUrl(obj.getString("backdrop_path"));
                movieClass.setLanguage(obj.getString("original_language"));

                movieList.add(movieClass);
            }
            return movieList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
