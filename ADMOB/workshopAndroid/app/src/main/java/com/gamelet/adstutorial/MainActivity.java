package com.gamelet.adstutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
*/

//implements RewardedVideoAdListener
public class MainActivity extends AppCompatActivity {

    Button loadInter;
    Button botaoInter;
    Button reward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadInter = (Button) findViewById(R.id.loaderInter);
        botaoInter = (Button) findViewById(R.id.inter);
        reward = (Button) findViewById(R.id.reward_video);

        /*==============================*/
        /*===============Banner===============*/
        /*==============================*/


        /*==============================*/
        /*=============Interstitial=============*/
        /*==============================*/

        /*===========*/
        /*===LoadAd===*/
        /*===========*/
        loadInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                botaoInter.setEnabled(true);
                loadInter.setEnabled(false);
            }
        });

        /*===========*/
        /*===ShowAd===*/
        /*===========*/
        botaoInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                botaoInter.setEnabled(false);
                loadInter.setEnabled(true);
            }
        });


        /*==============================*/
        /*===============Video===============*/
        /*==============================*/
        reward.setEnabled(false);
        reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reward.setEnabled(false);

            }
        });
    }

}
