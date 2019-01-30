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
        mPager = findViewById(R.id.pager)
        val pagerAdaper = SlidePagerAdapter(supportFragmentManager)
        mPager.adapter = pagerAdaper

    }

    private inner class SlidePagerAdapter(fragmentManager : FragmentManager): FragmentStatePagerAdapter(fragmentManager){
        override fun getCount(): Int = 5
        override fun getItem(position: Int): Fragment = FragmentOne()

    }

    override fun onBackPressed() {
        if(mPager.currentItem == 0) {

            super.onBackPressed()
        }else{
            mPager.currentItem = mPager.currentItem - 1
        }
    }

}
