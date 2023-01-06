package com.bitflyer.github.data.viewmodels.users


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.bitflyer.github.data.models.response.UserResponseItem
import com.bitflyer.github.data.models.response.userdetails.GithubUserDetails

import com.bitflyer.github.ui.base.BaseViewModel
import com.bitflyer.github.ui.users.UserNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor() :
    BaseViewModel<UserNavigator>() {


    val errorObservable = MutableLiveData<String>()

    val followerResonseObservable = MutableLiveData<List<UserResponseItem>>()

    val followerErrorResponseObservable = MutableLiveData<Response<List<UserResponseItem>>>()

    val followerDetailsResonseObservable = MutableLiveData<GithubUserDetails>()
    val followerDetailsErrorResponseObservable = MutableLiveData<Response<GithubUserDetails>>()



    fun getUsers() {
        viewModelScope.launch(Dispatchers.Main) {
            loadingStatus.value = true
            try {
                appRepo.getUsers().collect { response ->
                    loadingStatus.value = false
                    if (response.isSuccessful) {
                        followerResonseObservable.value = response.body()
                    } else {
                        followerErrorResponseObservable.value = response
                    }
                }
            } catch (throwable: Exception) {
                loadingStatus.value = false
                errorObservable.value = throwable.message.toString()
            }
        }
    }

    fun getFollowersPage(pos:Int) {
        viewModelScope.launch(Dispatchers.Main) {
            loadingStatus.value = true
            try {
                appRepo.getUsersPage(pos).collect { response ->
                    loadingStatus.value = false
                    if (response.isSuccessful) {
                        var latestList:ArrayList<UserResponseItem> = ArrayList<UserResponseItem>()
                       latestList = followerResonseObservable.value as ArrayList<UserResponseItem>
                        latestList.addAll(response.body()!!)
                        followerResonseObservable.value = latestList
                    } else {
                        followerErrorResponseObservable.value = response
                    }
                }
            } catch (throwable: Exception) {
                loadingStatus.value = false
                errorObservable.value = throwable.message.toString()
            }
        }
    }

    fun getUserDetail(url:String) {
        viewModelScope.launch(Dispatchers.Main) {
            loadingStatus.value = true
            try {
                appRepo.getUserDetail(url).collect { response ->
                    loadingStatus.value = false
                    if (response.isSuccessful) {
                        followerDetailsResonseObservable.value = response.body()
                    } else {
                        followerDetailsErrorResponseObservable.value = response
                    }
                }
            } catch (throwable: Exception) {
                loadingStatus.value = false
                errorObservable.value = throwable.message.toString()
            }
        }
    }

}