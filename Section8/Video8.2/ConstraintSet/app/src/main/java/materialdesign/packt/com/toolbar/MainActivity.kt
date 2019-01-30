package materialdesign.packt.com.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import android.content.DialogInterface
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import android.R.array
import android.media.Image
import android.os.Build
import android.support.constraint.ConstraintSet
import android.transition.TransitionManager
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImageTransition()
    }
    private fun ImageTransition() {
        var constraintSet = false
        val constraint1 = ConstraintSet()
        constraint1.clone(activity_main)
        val constraintset2 = ConstraintSet()
        constraintset2.clone(this,R.layout.activity_main_alt)
        findViewById<ImageView>(R.id.imageView).setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT  ){
                TransitionManager.beginDelayedTransition(activity_main)
                val constraint = if(constraintSet)
                    constraint1 else constraintset2
                constraint.applyTo(activity_main)
                constraintSet =! constraintSet
            }
        }

    }
}
