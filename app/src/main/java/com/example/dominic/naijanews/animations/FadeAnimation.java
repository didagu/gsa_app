package com.example.dominic.naijanews.animations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dominic.naijanews.AppIntro;
import com.example.dominic.naijanews.MainActivity;
import com.example.dominic.naijanews.R;
import com.example.dominic.naijanews.slides.FirstSlide;
import com.example.dominic.naijanews.slides.FourthSlide;
import com.example.dominic.naijanews.slides.SecondSlide;
import com.example.dominic.naijanews.slides.ThirdSlide;


public class FadeAnimation extends AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(new FirstSlide(), getApplicationContext());
        addSlide(new SecondSlide(), getApplicationContext());
        addSlide(new ThirdSlide(), getApplicationContext());
        addSlide(new FourthSlide(), getApplicationContext());

        setFadeAnimation();
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    public void getStarted(View v){
        loadMainActivity();
    }
}