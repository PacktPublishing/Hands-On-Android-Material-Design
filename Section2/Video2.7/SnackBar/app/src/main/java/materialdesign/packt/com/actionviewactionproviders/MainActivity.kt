package materialdesign.packt.com.CollapsingToolbar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.Menu
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.activity_main_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val activityView : View = findViewById(R.id.activity_main)
        val snack : Snackbar = Snackbar.make(activityView,"This is My Snack Bar Test", Snackbar.LENGTH_INDEFINITE)
        snack.setAction("Dismiss")
        { snack.dismiss()}
        snack.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem)= when (item.itemId) {
        R.id.action_item1 -> {
            true
        }

        R.id.action_item2 -> {
            true
        }
        R.id.action_settings -> {
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}