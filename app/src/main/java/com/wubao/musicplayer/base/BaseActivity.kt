package com.wubao.musicplayer.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

abstract class BaseActivity : AppCompatActivity(),AnkoLogger{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }


    /**
     * adapter listener
     */
    open protected fun initListener() {

    }

    /**
     * 初始化数据
     */
    open protected fun initData() {

    }

    abstract fun getLayoutId(): Int

    protected fun myToast(msg: String) {
        runOnUiThread { toast(msg) }
    }

    /**
     * 开启一个Activity并且结束当前页面
     */
    inline fun<reified T:BaseActivity>  startActivityAndFinish(){
        startActivity<T>()
        finish()
    }
}