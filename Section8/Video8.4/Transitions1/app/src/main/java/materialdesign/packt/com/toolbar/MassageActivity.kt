package materialdesign.packt.com.toolbar

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.opengl.Visibility
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewAnimationUtils
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_massage.*

/**
 * Created by ${Mona}
 */
class MassageActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_massage)
    }
    var checker = 0
    fun CircularTransition(view: View){
        val x : Int = (view.left + view.right )/2
        val y : Int = (view.bottom + view.top )/2
        val radius = Math.max(cl_view.width,cl_view.height)* 0.2f

   if(checker == 0){
       checker = 1
       cl_view.background = resources.getDrawable(R.drawable.capture)
       ViewAnimationUtils.createCircularReveal(cl_view,x,y,0f,radius).start()
   }else if(checker == 1) {
       checker = 0
       cl_view.background = resources.getDrawable(R.drawable.capture2)
       ViewAnimationUtils.createCircularReveal(cl_view,x,y,0f,radius).start()
   }
    }

    }