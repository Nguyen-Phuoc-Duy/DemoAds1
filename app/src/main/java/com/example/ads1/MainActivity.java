package com.example.ads1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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

    }
}
