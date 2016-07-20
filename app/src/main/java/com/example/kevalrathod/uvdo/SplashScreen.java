package com.example.kevalrathod.uvdo;

import android.view.Menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/**
 * Created by Keval Rathod on 7/19/2016.
 */
public class SplashScreen extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Make sure this is before calling super.onCreate
        setTheme(R.style.splashScreenTheme);
        super.onCreate(savedInstanceState);
    }

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this, Menu.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

