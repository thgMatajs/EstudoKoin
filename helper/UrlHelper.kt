package com.thg.estudokoin.helper

import android.content.Context
import android.net.Uri
import android.support.customtabs.CustomTabsIntent
import android.support.v4.content.ContextCompat
import com.thg.estudokoin.R

class UrlHelper {

    fun launchUrl(context: Context, uri: Uri) {
        val customTabsIntent = CustomTabsIntent.Builder()
            .addDefaultShareMenuItem()
            .setToolbarColor(
                ContextCompat.getColor(context, R.color.colorPrimary))
            .setShowTitle(true)
            .build()
        customTabsIntent.launchUrl(context, uri)
    }
}