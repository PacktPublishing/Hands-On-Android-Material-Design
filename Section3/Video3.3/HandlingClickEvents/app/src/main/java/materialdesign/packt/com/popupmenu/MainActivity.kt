package materialdesign.packt.com.popupmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Menu
import android.view.MenuItem
import android.view.MenuInflater
import android.support.v7.widget.Toolbar;
import android.widget.Toast
import java.time.Duration


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.nav_home -> {
            if(drawerLayout!!.isDrawerOpen(GravityCompat.START)){
                drawerLayout!!.closeDrawer(GravityCompat.START)
            }
            true
        }
        R.id.nav_notifications -> {
            true
        }
        R.id.nav_location -> {
            true
        }
        else -> {
            false
        }

    }

    var drawerLayout: DrawerLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigation_drawer)
        val toolbar: Toolbar = findViewById(R.id.activity_main_toolbar)
        setSupportActionBar(toolbar)

        val navigationLayout: NavigationView = findViewById(R.id.nav_view)
        navigationLayout.setNavigationItemSelectedListener(this)
        drawerLayout = findViewById(R.id.navigation_drawer_layout)
        val actionToggle: ActionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_opens, R.string.nav_closes)
        drawerLayout?.setDrawerListener(actionToggle)
        actionToggle.syncState()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_item1 -> {
            true
        }
        R.id.action_item2 -> {
            true
        }
        R.id.action_setting -> {
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }

    }

}
