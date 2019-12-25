package com.wubao.musicplayer.ui.activity

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.wubao.musicplayer.R
import com.wubao.musicplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

class SplashActivity: BaseActivity(), ViewPropertyAnimatorListener {
    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        //补间动画,属性动画这里是属性动画
        ViewCompat.animate(imageView).scaleX(1.0f).scaleY(1.0f).setListener(this).setDuration(2000)
    }

    override fun onAnimationEnd(view: View?) {
        //动画结束,加入主界面
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }

}