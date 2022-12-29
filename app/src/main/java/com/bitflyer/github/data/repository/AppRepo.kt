package com.bitflyer.github.data.repository

import com.bitflyer.github.data.api.AppApi
import com.bitflyer.github.data.models.response.FollowerResponseItem

import com.bitflyer.github.data.models.response.userdetails.GithubUserDetails
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response
import javax.inject.Inject

class AppRepo @Inject constructor(private val appApi: AppApi) {



    fun getUsers():Flow<Response<List<FollowerResponseItem>>> = flow {
        val response = appApi.getUsers("Bearer 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")
        emit(response)
    }.flowOn(Dispatchers.IO)

    fun getUsersPage(pos:Int):Flow<Response<List<FollowerResponseItem>>> = flow {
        val response = appApi.getUsersPage("Bearer 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",pos)
        emit(response)
    }.flowOn(Dispatchers.IO)


    fun getUserDetail(url:String):Flow<Response<GithubUserDetails>> = flow {
        val response = appApi.getUserDetail(url)
        emit(response)
    }.flowOn(Dispatchers.IO)



}