package api;

import java.util.ArrayList;

import model.MovieResponse;
import model.MovieTile;
import model.RecommendationsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by cognoscis on 6/1/18.
 */

public interface ApiInterface {
    @Headers({"Accept-Version: 1.0.0"})
    @GET("cats")
    Call<MovieResponse> getHomeScreenData();

    @Headers({"Accept-Version: 1.0.0"})
    @GET("cards/{tileId}")
    Call<ArrayList<MovieTile>> getMovieTileDetails(@Path("tileId") String tileId);

    @Headers({"Accept-Version: 1.0.0"})
    @GET("related/{tileId}")
    Call<RecommendationsResponse> getRecommendations(@Path("tileId") String tileId);
}

