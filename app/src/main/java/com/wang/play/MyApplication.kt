package com.wang.play

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import cn.leancloud.AVOSCloud
import com.tencent.mmkv.MMKV


class MyApplication : Application() {
    
    companion object {
        //全局Context
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        //聚合数据APP_KEY,News数据一天一百次
        const val APP_KEY = "9a721292358a94f0c92caba0b3064cb5"

        //Pixabay中我的KEY
        const val Pixabay_Key = "20693865-3b0038f8765a58dc75d008c2c"

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        //观察进程的lifecycle
      //  ProcessLifecycleOwner.get().lifecycle.addObserver(MyApplicationObserver())

        //初始化MMKV
        val rootDir = MMKV.initialize(this)

        //初始化LeanCloud
        AVOSCloud.initialize(
            this,
            "EmE3O3B6rRiaayIN5BrrQS6Y-gzGzoHsz",
            "sDyW32EvUihIggtDYpG2LsGa",
            "https://eme3o3b6.lc-cn-n1-shared.com"
        )

    }


    //观察应用的生命周期
    class MyApplicationObserver : LifecycleObserver {

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        fun applicationStop() {
            //Toast.makeText(MyApplication.context, "您的应用已退出，请小心", Toast.LENGTH_SHORT).show()
        }

    }


}