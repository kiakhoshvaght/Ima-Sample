package com.ima.ima_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.srt.adwisedbiz.AdView;
import com.srt.adwisedbiz.AdWisedBiz;
import com.srt.adwisedbiz.InAppAdvertise;
import com.srt.adwisedbiz.InAppConstants;
import com.srt.adwisedbiz.InterstitialActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing
        AdWisedBiz.init(this);
        InAppAdvertise.init(this);

        //Loading ad view
        AdView adView = findViewById(R.id.banner);
        adView.loadAd("You Ad unit id here.", InAppConstants.AdType.BANNER, true);

        //Loading interstitial activity
        InterstitialActivity.show(this, "You Ad unit id here.", true);
    }
}
