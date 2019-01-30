package materialdesign.packt.com.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager


class MainActivity : AppCompatActivity() {

    private lateinit var mPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var SliderImg = intArrayOf(
                R.drawable.capture,
                R.drawable.capture1,
                R.drawable.capture2,
                R.drawable.capture3
        )
        mPager = findViewById(R.id.pager)
        val mSlider = ImageSlideShowAdapter(SliderImg,this)
        mPager.adapter = mSlider
    }



}
