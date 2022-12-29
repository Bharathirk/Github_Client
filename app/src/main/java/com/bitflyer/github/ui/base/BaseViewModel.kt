package com.bitflyer.github.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bitflyer.github.data.repository.AppRepo
import java.lang.ref.WeakReference
import javax.inject.Inject

abstract class BaseViewModel<N> : ViewModel() {

    @Inject
    lateinit var appRepo: AppRepo


    private lateinit var mNavigator: WeakReference<N>

    var navigator: N
        get() = mNavigator.get()!!
        set(navigator) {
            this.mNavigator = WeakReference(navigator)
        }

    val loadingStatus = MutableLiveData<Boolean>()
}