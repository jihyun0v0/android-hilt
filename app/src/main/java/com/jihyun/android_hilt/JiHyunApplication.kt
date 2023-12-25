package com.jihyun.android_hilt

import android.app.Application
import androidx.databinding.library.BuildConfig


@HiltAndroidApp
class JiHyunApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}