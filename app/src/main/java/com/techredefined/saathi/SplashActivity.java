package com.techredefined.saathi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by uditchugh on 08/03/17.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PrefManager prefManager = new PrefManager(this);
        if (prefManager.isFirstTimeLaunch()) {
            startActivity(new Intent(this, WelcomeActivity.class));
            finish();
        } else {

            if (AuthenticatorActivity.isUserLoggedIn()) {
                startActivity(new Intent(this, MainActivity.class));
            } else
                startActivity(new Intent(this, AuthenticatorActivity.class));
            finish();
        }
    }
}
