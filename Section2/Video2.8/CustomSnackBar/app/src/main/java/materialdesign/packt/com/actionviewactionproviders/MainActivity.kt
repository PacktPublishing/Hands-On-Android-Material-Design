package materialdesign.packt.com.CollapsingToolbar

import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.activity_main_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val activityView: View = findViewById(R.id.activity_main)
        val snack: Snackbar = Snackbar.make(activityView, "This Is my SnackBar Test", Snackbar.LENGTH_INDEFINITE)
        snack.setAction("Dismiss")
        { snack.dismiss() }
        val snackbarLayout = snack.view
        snackbarLayout.setBackgroundColor(resources.getColor(R.color.colorAccent))
        val sntextview = snackbarLayout.findViewById(android.support.design.R.id.snackbar_text) as TextView
        val snAction = snackbarLayout.findViewById(android.support.design.R.id.snackbar_action) as TextView
        sntextview.setTextColor(Color.WHITE)
        snAction.setTextColor(Color.GRAY)
        sntextview.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_attach_file,0,0,0)
        sntextview.compoundDrawablePadding = resources.getDimensionPixelOffset(R.dimen.design_snackbar_padding_horizontal)
        snack.show()

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
        R.id.action_settings -> {
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}