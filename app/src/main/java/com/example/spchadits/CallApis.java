package com.example.spchadits;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/*
public interface CallApis {
    @Multipart
    @POST("api/DocFile")
    Call<HaditsAuthor> uploadImage(@Part MultipartBody.Part part, @Part("somedata") RequestBody requestBody);
} */

public interface CallApis {
    @GET("api/authors")
    Call<HaditsAuthor> getContentAuthor();

    @GET("api/books")
    Call<HaditsBook> getContentBook();

    @GET("api/chapters")
    Call<HaditsChapter> getContentChapter();
}
