package com.bitflyer.github.ui.base

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.bitflyer.github.R
import com.bitflyer.github.databinding.ActivityBaseBinding
import javax.inject.Inject

abstract class BaseFragment<VB : ViewDataBinding, V : Any> : Fragment() {


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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        baseBinding = DataBindingUtil.inflate(inflater, R.layout.activity_base, container, false)
        return baseBinding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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

    protected fun showToast(input: String?) {
        Toast.makeText(context, input, Toast.LENGTH_SHORT).show()
    }


    protected fun showLoading() {
        baseBinding!!.includProgress.progressBar.visibility = View.VISIBLE
    }

    protected fun hideLoading() {
        baseBinding!!.includProgress.progressBar.visibility = View.INVISIBLE
    }

    protected fun openActivity(cls: Class<*>, shouldCloseActivity: Boolean) {
        startActivity(Intent(requireActivity(), cls))
        if (shouldCloseActivity) requireActivity().finish()
    }

    protected fun openActivity(intent: Intent, shouldCloseActivity: Boolean) {
        startActivity(intent)
        if (shouldCloseActivity) requireActivity().finish()
    }

    protected fun observeLoadingStatus() {
        viewModel!!.loadingStatus.observe(viewLifecycleOwner, Observer { isLoading ->
            if (!isLoading!!) {
                hideLoading()
            } else {
                showLoading()
            }
        })
    }


}