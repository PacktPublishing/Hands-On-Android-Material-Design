package materialdesign.packt.com.toolbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.transition.*
import android.view.Window

/**
 * Created by ${Mona}
 */
class MassageActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_massage)
        setSupportActionBar(findViewById(R.id.activity_msg_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val string : String = intent.getStringExtra("Transition")
        Animation(string)
    }


        fun Animation(animation : String){
            when(animation) {
                "Explode" -> {
                    val transition : Transition = TransitionInflater.from(this).inflateTransition(R.transition.explode)
                    window.enterTransition = transition
                }
                "Slide" -> {
                    val transition : Transition = TransitionInflater.from(this).inflateTransition(R.transition.slide)
                    window.enterTransition = transition
                }
                "Fade"-> {
                   val transition : Transition = TransitionInflater.from(this).inflateTransition(R.transition.fade)
                    window.enterTransition = transition
                }
            }
        }
    }