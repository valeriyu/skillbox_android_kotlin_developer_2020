package com.valeriyu.networking

import android.app.Application
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.soloader.SoLoader
import com.valeriyu.networking.networking.HTTP

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)

         if (BuildConfig.DEBUG && FlipperUtils.shouldEnableFlipper(this)) {
            AndroidFlipperClient.getInstance(this)
                .apply {
                    addPlugin(InspectorFlipperPlugin(this@App, DescriptorMapping.withDefaults()))
                    addPlugin(HTTP.flipperNetworkPlugin)
                }
                .start()
        }
    }
}