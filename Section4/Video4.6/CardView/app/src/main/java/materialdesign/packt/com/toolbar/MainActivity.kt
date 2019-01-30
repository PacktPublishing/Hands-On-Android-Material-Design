package materialdesign.packt.com.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.activity_main_toolbar))
        val CardView : CardView = findViewById(R.id.main_cardView)
        CardView.setOnClickListener { Toast.makeText(this,"Hello CardView",Toast.LENGTH_SHORT).show() }
        CardView.radius = 60.5F
    }
}
