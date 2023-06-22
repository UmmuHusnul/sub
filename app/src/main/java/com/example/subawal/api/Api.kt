package com.example.subawal.api

import com.example.subawal.data.model.DetailUserResponse
import com.example.subawal.data.model.User
import com.example.subawal.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}