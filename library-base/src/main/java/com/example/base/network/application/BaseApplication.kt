package com.example.base.network.application

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.example.base.BuildConfig

/**
 * create by libo
 * create on 2020/8/4
 * description Application
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initARouter()
    }

    /**
     * 初始化路由
     */
    private fun initARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }

}