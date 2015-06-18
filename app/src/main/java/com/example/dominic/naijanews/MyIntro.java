package com.example.dominic.naijanews;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.dominic.naijanews.slides.FirstSlide;
import com.example.dominic.naijanews.slides.FourthSlide;
import com.example.dominic.naijanews.slides.SecondSlide;
import com.example.dominic.naijanews.slides.ThirdSlide;
import com.example.dominic.naijanews.MainActivity;

/**
 * Created by dominic on 18/06/2015.
 */
public class MyIntro extends AppIntro {

    // Please DO NOT override onCreate. Use init
    @Override
    public void init(Bundle savedInstanceState) {

        //slide's fragments here
        //AppIntro will automatically generate the dots indicator and buttons.
        addSlide(new FirstSlide(), getApplicationContext());
        addSlide(new SecondSlide(), getApplicationContext());
        addSlide(new ThirdSlide(), getApplicationContext());
        addSlide(new FourthSlide(), getApplicationContext());
        // OPTIONAL METHODS
        // Override bar/separator color
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));
        showSkipButton(true);

    }

    @Override
    public void onSkipPressed() {
        Intent startMainActivity = new Intent(MyIntro.this, itemListActivity.class);
        this.startActivity(startMainActivity);
        this.finish();
    }

    @Override
    public void onDonePressed() {
        Intent startMainActivity = new Intent(MyIntro.this, itemListActivity.class);
        this.startActivity(startMainActivity);
        this.finish();
    }
}
