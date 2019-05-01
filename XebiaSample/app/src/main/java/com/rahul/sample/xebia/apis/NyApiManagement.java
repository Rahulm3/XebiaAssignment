package com.rahul.sample.xebia.apis;



import com.rahul.sample.xebia.models.NyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NyApiManagement {

    /**
     * Api to fetch news  list from server.
     * @return Call instance for this api.
     */
    @Headers({"Content-Type: application/json",
            "Accept: application/json"})
    @GET("svc/mostpopular/v2/viewed/{Id}.json")
    Call<NyResponse> getnewsList(@Path("Id") String id, @Query("api-key") String key);

}
