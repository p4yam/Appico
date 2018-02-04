package ir.kivee.appico;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity implements ViewPagerEx.OnPageChangeListener {

    private SliderLayout topSlider;
    private HashMap<String, String> topSliderSource;



    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topSlider = (SliderLayout) findViewById(R.id.activity_main_slider);

        initTopSlider();
    }

    private void initTopSlider() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        //topSlider.setLayoutParams(new ConstraintLayout.LayoutParams(width, width));
        topSliderSource = new HashMap<>();
        topSliderSource.put("هدر اول",
                "http://wallpaperswide.com/download/salt_lake_4-wallpaper-1366x768.jpg");
        topSliderSource.put("هدر دوم",
                "http://wallpaperswide.com/download/" +
                        "aurora_borealis_atmosphere-wallpaper-1366x768.jpg");
        topSliderSource.put("هدر سوم",
                "http://wallpaperswide.com/download/" +
                        "very_nice_satellite_images_of_iran-wallpaper-1366x768.jpg");
        for (String imgName :
                topSliderSource.keySet()) {
            TextSliderView txtSlider = new TextSliderView(this);
            txtSlider.description(imgName)
                    .image(topSliderSource.get(imgName))
                    .setScaleType(BaseSliderView.ScaleType.Fit);
            txtSlider.bundle(new Bundle());
            txtSlider.getBundle()
                    .putString("extra", imgName);
            topSlider.addSlider(txtSlider);
        }

        topSlider.setPresetTransformer(SliderLayout.Transformer.Default);
        topSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        topSlider.setCustomAnimation(new DescriptionAnimation());
        topSlider.setDuration(4000);
        topSlider.addOnPageChangeListener(this);
        topSlider.startAutoCycle();
    }

    @Override
    protected void onStop() {
        topSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
