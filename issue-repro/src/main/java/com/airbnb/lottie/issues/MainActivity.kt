package com.airbnb.lottie.issues

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.issues.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Reproduce any issues here.
        val lottieAnimationView: LottieAnimationView = findViewById(R.id.lottie_v)
        lottieAnimationView.setAnimationFromUrl("https://assets5.lottiefiles.com/packages/lf20_hfgbno.json")
    }
}
