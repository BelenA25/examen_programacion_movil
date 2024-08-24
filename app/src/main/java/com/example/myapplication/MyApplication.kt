package com.example.myapplication

import android.app.Application
import io.sentry.android.core.SentryAndroid

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        SentryAndroid.init(this) { options ->
            options.dsn = "tu_DSN_aquí"
        }
    }
}
