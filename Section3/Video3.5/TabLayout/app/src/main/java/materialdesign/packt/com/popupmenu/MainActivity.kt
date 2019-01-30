package materialdesign.packt.com.popupmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.view.Menu
import android.view.MenuItem
import android.view.MenuInflater



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.activity_main_toolbar))
        val tabLayout : TabLayout = findViewById(R.id.main_tablayout)
        tabLayout.addTab(tabLayout.newTab().setText(R.string.nav_Notifications))
        tabLayout.addTab(tabLayout.newTab().setText("item2"))
        tabLayout.addTab(tabLayout.newTab().setText(R.string.nav_Notifications).setIcon(R.drawable.ic_notifications))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_location))
    }


}
