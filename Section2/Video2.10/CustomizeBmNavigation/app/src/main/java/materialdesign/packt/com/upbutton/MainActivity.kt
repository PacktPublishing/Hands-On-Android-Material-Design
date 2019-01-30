package materialdesign.packt.com.upbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.internal.BottomNavigationMenu
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.activity_main_toolbar))
        val bottomNavigation: BottomNavigationView = findViewById(R.id.main_BottomNavigation)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.action_account -> {
                main_txt.text = "Profile is clicked"
                true
            }

            R.id.action_fav -> {
                main_txt.text = "Fav is clicked"
                true
            }
            R.id.action_settings -> {
                main_txt.text = "Setting is clicked"
                true
            }

            else -> {
                false
            }
        }
    }
}
