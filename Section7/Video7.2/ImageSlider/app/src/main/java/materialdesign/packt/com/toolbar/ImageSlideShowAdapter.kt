package materialdesign.packt.com.toolbar

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.View
import android.widget.LinearLayout
import android.view.LayoutInflater
import android.support.v4.content.ContextCompat.getSystemService
import android.view.ViewGroup
import android.widget.ImageView


/**
 * Created by ${Mona}
 */
class ImageSlideShowAdapter(val item : IntArray, val context: Context)  : PagerAdapter() {
    private val inflater: LayoutInflater
    init {
        inflater = LayoutInflater.from(context)
    }

    override fun isViewFromObject(view: View, p1: Any): Boolean {
        return view === p1 as LinearLayout
    }

    override fun getCount(): Int {
        return item.size
    }



    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemView = inflater.inflate(R.layout.main_slide_show, container, false)!!
        val imageView = itemView.findViewById(R.id.slide_img) as ImageView
        imageView.setImageResource(item[position])

        container.addView(itemView)

        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}