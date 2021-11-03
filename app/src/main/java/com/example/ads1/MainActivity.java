package com.example.ads1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class MainActivity extends AppCompatActivity {
    private BannerView bannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize the HUAWEI Ads SDK.
        HwAds.init(this);

        setContentView(R.layout.activity_main);
        // Obtain BannerView.
        BannerView bannerView = findViewById(R.id.hw_banner_view);
        // Set the ad unit ID and ad dimensions. "testw6vs28auh3" is a dedicated test ad unit ID.
        bannerView.setAdId("testw6vs28auh3Edit");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_360_57);
        // Set the refresh interval to 30 seconds.
        bannerView.setBannerRefresh(30);
        // Create an ad request to load an ad.
        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);
    }
}
