package com.example.renh.workshopcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ///////////////////////////////////
        //////////////Consent//////////////
        ///////////////////////////////////

        ///////////////////////////////////
        //////////////Splash AD////////////
        ///////////////////////////////////

        ///////////////////////////////////
        /////////Auto Interstitial/////////
        ///////////////////////////////////

        ///////////////////////////////////
        /////////////Start SDK/////////////
        ///////////////////////////////////

        setContentView(R.layout.activity_main);
    }

    //Quando se carrega no botão para andar para trás para sair da aplicação
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void btnNextActivity(View view) {
        Intent nextActivity = new Intent(this, SecondActivity.class);
        startActivity(nextActivity);
    }

    //Rewarded Video
    public void btnReward(View view) {

    }
}
