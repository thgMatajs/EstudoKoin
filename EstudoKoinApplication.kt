package com.thg.estudokoin

import android.app.Application
import org.koin.android.ext.android.startKoin

class EstudoKoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(applicationModule))
    }
}