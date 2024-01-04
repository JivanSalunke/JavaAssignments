package rest;

import rest.model.PhotoResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JsonPlaceholderAPI {
        @GET("/photos")
        Call<List<PhotoResponse>> getPhotos();
}
