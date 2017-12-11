package com.asacs.uav.asacsdatabase;

import android.app.Activity;
import android.os.Bundle;

import com.bugfender.sdk.Bugfender;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bugfender logging
        Bugfender.init(this, "zYr3Yb4uaRu8aCa8lejEHlH57Xu6o4z8", BuildConfig.DEBUG);
        Bugfender.enableLogcatLogging();
        Bugfender.enableUIEventLogging(getApplication());
        Bugfender.enableCrashReporting();
        setContentView(R.layout.activity_main);
    }
}
