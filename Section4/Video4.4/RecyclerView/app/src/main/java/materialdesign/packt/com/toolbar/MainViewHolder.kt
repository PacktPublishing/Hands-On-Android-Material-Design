package materialdesign.packt.com.toolbar

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.rec_item.view.*

/**
 * Created by ${Mona}
 */
class MainViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val tvUserName = view.rec_item_username
    val tvUserImg  = view.rec_item_user_img
    val tvUserMsg = view.rec_item_brief_msg
    val Ll_items = view.rec_Ll_item_main
}