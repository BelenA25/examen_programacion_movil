package com.example.myapplication

import android.app.Application
import io.sentry.android.core.SentryAndroid

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        SentryAndroid.init(this) { options ->
            options.dsn = "https://0c08190d42dbb740cd6282868b93c221@o4507398745358336.ingest.us.sentry.io/4507828391575552"
        }
    }
}
