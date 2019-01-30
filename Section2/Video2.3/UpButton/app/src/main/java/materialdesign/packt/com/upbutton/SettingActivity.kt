package materialdesign.packt.com.upbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        setSupportActionBar(findViewById(R.id.activity_setting_toolbar))
      supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
