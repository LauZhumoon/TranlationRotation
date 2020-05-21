package com.laustraining.animations2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bart;

    Animation skate;


    public void click(View view) {

        Log.i("INFO", "Image pressed");

        bart.startAnimation(skate);

 //       Animation skateT = bart.animate().translationXBy(-5000).start(0).setDuration(3000);

   //     Animation skateR = bart.animate().rotation(720).start(3000).setStartDelay().setDuration(3000);

  /*      if (bart.getId() == R.id.bart) {

            Animation skate = AnimationUtils.loadAnimation(this, R.xml.animation_skate);

            skate.reset();

            bart.clearAnimation();

            bart.startAnimation(skate);

        }
*/

    }





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       bart = (ImageView) findViewById(R.id.bart);

       skate = AnimationUtils.loadAnimation(this, R.anim.skate);



    }
}
