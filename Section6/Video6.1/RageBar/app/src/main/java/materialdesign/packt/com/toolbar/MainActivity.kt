package materialdesign.packt.com.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_rangebar.setOnSeekBarChangeListener(
                object : SeekBar.OnSeekBarChangeListener{
                    internal var ChangedValue = 0

                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                        ChangedValue = progress
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {

                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {
                        Toast.makeText(this@MainActivity,"The Progress Value is : $ChangedValue",Toast.LENGTH_SHORT).show()
                    }
                }
        )
    }


}
