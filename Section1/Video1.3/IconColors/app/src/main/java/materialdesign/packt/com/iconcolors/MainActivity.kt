package materialdesign.packt.com.iconcolors

import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.VectorDrawable
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawable = resources.getDrawable(R.drawable.ic_add_alert_black_24dp)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            val vectorDrawable = drawable as VectorDrawable
        }else{
            val bitmapDrawable = drawable as  BitmapDrawable
        }
    }
}
