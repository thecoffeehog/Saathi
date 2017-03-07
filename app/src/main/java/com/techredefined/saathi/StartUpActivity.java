package com.techredefined.saathi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class StartUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        if (AuthenticatorActivity.isUserLoggedIn()) {
            startActivity(new Intent(StartUpActivity.this, MapsActivity.class));
        } else
            startActivity(new Intent(StartUpActivity.this, AuthenticatorActivity.class));

    }
}
