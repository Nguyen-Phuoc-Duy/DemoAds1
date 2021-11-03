package com.example.ads1;

import android.app.Application;
import com.huawei.hms.ads.HwAds;

public class AdSampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the Ads SDK.
        HwAds.init(this);
    }
}
