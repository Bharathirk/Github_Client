package com.bitflyer.github.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.ViewModelProvider
import com.bitflyer.github.BR
import com.bitflyer.github.R
import com.bitflyer.github.data.viewmodels.splash.SplashViewModel
import com.bitflyer.github.databinding.ActivitySplashBinding
import com.bitflyer.github.ui.base.BaseActivity
import com.bitflyer.github.ui.base.BaseViewModel
import com.bitflyer.github.ui.users.UserActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding, SplashNavigator>(), SplashNavigator {

    private var activitySplashBinding: ActivitySplashBinding? = null
    private lateinit var splashViewModel: SplashViewModel

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun getViewModel(): BaseViewModel<SplashNavigator> {
        splashViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
        return splashViewModel
    }

    override fun getViewBindingVarible(): Int {
        return BR.splashViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySplashBinding = getViewDataBinding()
        activitySplashBinding?.splashViewModel = splashViewModel
        splashViewModel.navigator = this

        /*Splash Time out call back*/
        Handler(Looper.getMainLooper()).postDelayed({
            openActivity(UserActivity::class.java, true)
            finish()

        }, 1000)

    }
}