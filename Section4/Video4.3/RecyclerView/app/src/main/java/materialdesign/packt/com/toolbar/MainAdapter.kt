package materialdesign.packt.com.toolbar

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ${Mona}
 */
class MainAdapter(val item : ArrayList<MyList>, val context: Context)  : RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(context).inflate(R.layout.rec_item, parent, false))
}

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder : MainViewHolder, position: Int) {
        holder?.tvUserName.text = item.get(position).userName
        holder?.tvUserMsg.text = item.get(position).userMsg
        holder?.tvUserImg.setImageResource(item.get(position).userImg)

    }

}