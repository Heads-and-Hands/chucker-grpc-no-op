package com.chuckerteam.chucker.api

import android.content.Context
import android.content.Intent

/**
 * No-op implementation.
 */
public object Chucker {
    
    @JvmStatic
    public fun getLaunchIntent(context: Context, screen: Int): Intent = Intent()

    @JvmStatic
    public fun getLaunchIntent(context: Context): Intent = Intent()

    @JvmStatic
    public fun registerDefaultCrashHandler(collector: ChuckerCollector) {
        // Empty method for the library-no-op artifact
    }

    @JvmStatic
    public fun dismissTransactionsNotification(context: Context) {
        // Empty method for the library-no-op artifact
    }

    @JvmStatic
    public fun dismissErrorsNotification(context: Context) {
        // Empty method for the library-no-op artifact
    }
}
