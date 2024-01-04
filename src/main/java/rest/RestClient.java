package rest;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private JsonPlaceholderAPI jsonPlaceholderAPI;

    public RestClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
        System.out.println(retrofit);
        jsonPlaceholderAPI = retrofit.create(JsonPlaceholderAPI.class);
    }

    public JsonPlaceholderAPI getJsonPlaceholderAPI() {
        return jsonPlaceholderAPI;
    }
}