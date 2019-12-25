package com.wubao.musicplayer.util

import android.support.v7.widget.Toolbar
import com.wubao.musicplayer.R


/**
 * 所有界面toolbar管理
 */

interface ToolBarManager {

    val toolbar: Toolbar
    /**
     * 初始化主界面的toolbar
     */
    fun initMainToolBar(){
        toolbar.setTitle("影音")
        toolbar.inflateMenu(R.menu.main)
    }
}