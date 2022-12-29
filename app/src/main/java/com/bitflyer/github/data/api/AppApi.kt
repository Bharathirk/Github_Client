package com.bitflyer.github.data.api

import com.bitflyer.github.data.api.ApiConstants.API_FOLLOWERS
import com.bitflyer.github.data.models.response.FollowerResponseItem
import com.bitflyer.github.data.models.response.userdetails.GithubUserDetails
import retrofit2.Response
import retrofit2.http.*

interface AppApi {


    @GET(API_FOLLOWERS)
    suspend fun getUsers(@Header("Authorization") authorization: String): Response<List<FollowerResponseItem>>

    @GET(API_FOLLOWERS)
    suspend fun getUsersPage(@Header("Authorization") authorization: String, @Query("since") since: Int): Response<List<FollowerResponseItem>>

    @GET
    suspend fun getUserDetail(@Url url:String): Response<GithubUserDetails>


}