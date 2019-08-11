package com.example.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgApp, clover;
    LinearLayout textSplash, explore, menus;
    Animation fromBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialise animation
        fromBottom = AnimationUtils.loadAnimation(this, R.anim.from_bottom);

        bgApp = findViewById(R.id.bgapp);
        clover = findViewById(R.id.clover);
        textSplash = findViewById(R.id.textSplash);
        explore = findViewById(R.id.explore);
        menus = findViewById(R.id.menus);

        //alpha means visibility, so 0= invisible
        bgApp.animate().translationY(-1900).setDuration(1000).setStartDelay(300);
        clover.animate().alpha(0).setDuration(400).setStartDelay(600);
        textSplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        explore.startAnimation(fromBottom);
        menus.startAnimation(fromBottom);

    }
}
