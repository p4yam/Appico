package ir.kivee.appico.application;

import android.app.Application;

import ir.kivee.appico.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by narin on 2/4/18.
 */

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/vazir.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
