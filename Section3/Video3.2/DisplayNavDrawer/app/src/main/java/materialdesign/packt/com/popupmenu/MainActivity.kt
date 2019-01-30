package materialdesign.packt.com.popupmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Menu
import android.view.MenuItem
import android.view.MenuInflater
import android.support.v7.widget.Toolbar;


class
MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigation_drawer)
        val toolbar : Toolbar = findViewById(R.id.activity_main_toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout : DrawerLayout = findViewById(R.id.navigation_drawer_layout)
        val actionToggle : ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_opens,R.string.nav_closes)
        drawerLayout.setDrawerListener(actionToggle)
        actionToggle.syncState()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem)= when (item.itemId) {
        R.id.action_item1 ->{
            true
        }
        R.id.action_item2 ->{
            true
        }
        R.id.action_setting ->{
            true
        }else ->{
            super.onOptionsItemSelected(item)
        }

    }

}
