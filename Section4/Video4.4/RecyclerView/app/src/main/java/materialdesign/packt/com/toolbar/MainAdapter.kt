package materialdesign.packt.com.toolbar

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

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
        holder.tvUserImg.setImageResource(items.get(position).userImg)
        holder.Ll_items.setOnClickListener { ItemClicked(items.get(position).userName) }
    }
    fun ItemClicked(UserName : String){
        Toast.makeText(context,UserName,Toast.LENGTH_SHORT).show()
    }
}