package materialdesign.packt.com.toolbar

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewAnimationUtils
import android.view.ViewGroup
import android.widget.Toast
import materialdesign.packt.com.toolbar.R.id.rec_item_brief_edt
import materialdesign.packt.com.toolbar.R.string.txt_rec_msg

/**
 * Created by ${Mona}
 */
class MainAdapter(val items : ArrayList<MyList>, val context: Context)  : RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MainViewHolder {

        return MainViewHolder(LayoutInflater.from(context).inflate(R.layout.rec_item, parent, false))
}

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder : MainViewHolder, position: Int) {
        holder.tvUserName.text = items.get(position).userName
        holder.tvUserMsg.text = items.get(position).userMsg
       // holder.tvUserImg.setImageResource(items.get(position).userImg)
        holder.CvMain.setOnClickListener {
            val options : ActivityOptions = ActivityOptions.makeSceneTransitionAnimation(context as Activity? ,
                    holder.tvUserImg,"SharedElement")
            val intent = Intent(context,MassageActivity::class.java)
            startActivity(context,intent,options.toBundle())
           }
    }


}