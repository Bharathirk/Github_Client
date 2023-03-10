package com.bitflyer.github.ui.users

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bitflyer.github.BR
import com.bitflyer.github.R
import com.bitflyer.github.data.models.response.UserResponseItem
import com.bitflyer.github.data.viewmodels.users.UserViewModel
import com.bitflyer.github.databinding.ActivityFollowerBinding
import com.bitflyer.github.ui.UserDetailActivity
import com.bitflyer.github.ui.base.BaseActivity
import com.bitflyer.github.ui.base.BaseViewModel
import com.bitflyer.github.ui.base.PaginationScrollListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserActivity : BaseActivity<ActivityFollowerBinding, UserNavigator>(),
    UserNavigator, UserAdapter.FollowerClickManager {

    private var activityFollowerBinding: ActivityFollowerBinding? = null
    private lateinit var followerViewModel: UserViewModel
    private var dataItemList = mutableListOf<UserResponseItem?>()
    private var lastUserId:Int = 0
    var isLastPage: Boolean = false
    var isLoading: Boolean = false

    override fun getLayoutId(): Int {
        return R.layout.activity_follower
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
        activityFollowerBinding = getViewDataBinding()
        activityFollowerBinding?.followerViewModel = followerViewModel
        followerViewModel.navigator = this
        followerViewModel.getUsers()



        /*Show Error Toast*/
        followerViewModel.followerErrorResponseObservable.observe(
            this
        ) {
            showToast("failure")
        }

        /*handle Live Event Success Response*/
        followerViewModel.followerResonseObservable.observe(this) { appResponse ->
            hideLoading()
            appResponse.let { response ->
                

                var UserAdapter = UserAdapter(this, this)
                activityFollowerBinding?.userAdapter = UserAdapter
                UserAdapter.setFollwerList(response)
                dataItemList = response.toMutableList()
                lastUserId = dataItemList.get(dataItemList.size-1)?.id!!
                showToast("FetchingNewData")


            }
        }
        

        activityFollowerBinding!!.rvGitusers?.addOnScrollListener(object : PaginationScrollListener(
            activityFollowerBinding!!.rvGitusers.layoutManager as LinearLayoutManager
        ) {

            override fun isLastPage(): Boolean {
                return isLastPage
            }

            override fun isLoading(): Boolean {
                return isLoading
            }

            override fun loadMoreItems() {
                followerViewModel.getFollowersPage(lastUserId)

            }
        })

            /*handle Live Event Error Response*/
        followerViewModel.followerErrorResponseObservable.observe(this) { appResponse ->
            hideLoading()
            showToast("Failure")
        }

    }

    override fun onItemClick(followerItem: UserResponseItem) {
        var intent =Intent(this, UserDetailActivity::class.java)
        intent.putExtra("detail",followerItem)
        openActivity(intent, false)
    }




}