package materialdesign.packt.com.toolbar

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.transition.Explode
import android.transition.Transition
import android.transition.TransitionInflater
import android.util.Log
import android.view.View
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var options : ActivityOptions
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        options = ActivityOptions.makeSceneTransitionAnimation(this)
    }
    fun ExplodeEffect(view: View){
        OpenMassageActivity("Explode")

    }
    fun SlideEffect(view: View) {
        OpenMassageActivity( "Slide")

    }
    fun FadeEffect(view: View) {
        OpenMassageActivity( "Fade")

    }
    fun OpenMassageActivity(animation:String) {
        val intent = Intent(this, MassageActivity::class.java)
        intent.putExtra("Transition",animation)
        startActivity( intent ,options.toBundle())
    }
}
