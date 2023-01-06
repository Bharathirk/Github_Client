package com.bitflyer.github.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bitflyer.github.BR
import com.bitflyer.github.R
import com.bitflyer.github.data.models.response.UserResponseItem
import com.bitflyer.github.data.viewmodels.users.UserViewModel
import com.bitflyer.github.databinding.ActivityTestBinding
import com.bitflyer.github.ui.base.BaseActivity
import com.bitflyer.github.ui.base.BaseViewModel
import com.bitflyer.github.ui.users.UserNavigator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserDetailActivity : BaseActivity<ActivityTestBinding, UserNavigator>(),
    UserNavigator {

    private var activityTestBinding: ActivityTestBinding? = null
    private lateinit var followerViewModel: UserViewModel

    override fun getLayoutId(): Int {
        return R.layout.activity_test
    }

    override fun getViewModel(): BaseViewModel<UserNavigator> {
        followerViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        return followerViewModel
    }

    override fun getViewBindingVarible(): Int {
        return BR.followerViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        if (intent.extras != null) {
            var responseValue = intent.extras!!.get("detail") as UserResponseItem
            activityTestBinding = getViewDataBinding()
//            showToast(responseValue.login!!)
            followerViewModel.getUserDetail(responseValue.url!!)
        }



        /*handle Live Event Success Response*/
        followerViewModel.followerDetailsResonseObservable.observe(this) { appResponse ->
            hideLoading()
            appResponse.let { response ->
                activityTestBinding!!.githubUserDetails=response;
                Glide.with(this).load(response!!.avatarUrl).into(this.findViewById(R.id.imageView))


            }
        }

        /*handle Live Event Error Response*/
        followerViewModel.followerDetailsErrorResponseObservable.observe(this) { appResponse ->
            hideLoading()
        }
    }


}