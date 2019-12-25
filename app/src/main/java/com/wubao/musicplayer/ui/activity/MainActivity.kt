package com.wubao.musicplayer.ui.activity



import android.support.v7.widget.Toolbar
import com.wubao.musicplayer.R
import com.wubao.musicplayer.base.BaseActivity
import com.wubao.musicplayer.util.ToolBarManager
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolBarManager {

    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }
}
