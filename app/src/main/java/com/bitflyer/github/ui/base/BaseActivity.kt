package com.bitflyer.github.ui.base

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.bitflyer.github.R
import com.bitflyer.github.databinding.ActivityBaseBinding
import javax.inject.Inject

abstract class BaseActivity<VB : ViewDataBinding, V : Any> : AppCompatActivity() {


    private var dialog: AlertDialog? = null
    private var viewBinding: VB? = null
    private var viewModel: BaseViewModel<V>? = null
    private var baseBinding: ActivityBaseBinding? = null

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getViewModel(): BaseViewModel<V>

    abstract fun getViewBindingVarible(): Int

    fun getViewDataBinding(): VB {
        return viewBinding!!
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseBinding = DataBindingUtil.setContentView(this, R.layout.activity_base)
        setDataBinding()
        observeLoadingStatus()
    }

    private fun setDataBinding() {
        viewBinding =
            DataBindingUtil.inflate(layoutInflater, getLayoutId(), baseBinding!!.frameContent, true)
        this.viewModel = getViewModel()
        viewBinding!!.setVariable(getViewBindingVarible(), viewModel)
        viewBinding!!.executePendingBindings()
    }

    fun setHeaderTitle(title: String) {
        if (supportActionBar != null) supportActionBar!!.title = title
    }

    fun showBackButton(status: Boolean) {
        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(status)
        if (supportActionBar != null)
            supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_white_back)
    }

    fun showToast(input: String) {
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show()
    }

    fun showLoading() {
        baseBinding!!.includProgress.progressBar.visibility = View.VISIBLE
    }

    fun hideLoading() {
        baseBinding!!.includProgress.progressBar.visibility = View.INVISIBLE
    }

    fun observeLoadingStatus() {
        viewModel!!.loadingStatus.observe(this, Observer { isLoading ->
            if (!isLoading!!) {
                hideLoading()
            } else {
                showLoading()
            }
        })
    }

    protected fun openActivity(cls: Class<*>, shouldCloseActivity: Boolean) {
        startActivity(Intent(this, cls))
        if (shouldCloseActivity) finish()
    }

    protected fun openActivity(intent: Intent, shouldCloseActivity: Boolean) {
        startActivity(intent)
        if (shouldCloseActivity) finish()
    }

    fun glideSetImageView(imageView: ImageView, image: String, placeholder: Int) {
        Glide.with(this)
            .applyDefaultRequestOptions(
                RequestOptions()
                    .placeholder(placeholder)
                    .circleCrop()
                    .error(placeholder)
            )
            .load(image)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .into(imageView)
    }

}