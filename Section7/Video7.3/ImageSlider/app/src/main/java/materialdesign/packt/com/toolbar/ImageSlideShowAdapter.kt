package materialdesign.packt.com.toolbar

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.View
import android.widget.LinearLayout
import android.view.LayoutInflater
import android.support.v4.content.ContextCompat.getSystemService
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast


/**
 * Created by ${Mona}
 */
class ImageSlideShowAdapter(val item : IntArray, val context: Context)  : PagerAdapter() {
    private val inflater: LayoutInflater
    private  val MAX_VALUE = 200
    init {
        inflater = LayoutInflater.from(context)
    }

    override fun isViewFromObject(view: View, p1: Any): Boolean {
        return view === p1 as LinearLayout
    }

    override fun getCount(): Int {
        return item.size * MAX_VALUE
    }



    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemView = inflater.inflate(R.layout.main_slide_show, container, false)!!
        val imageView = itemView.findViewById(R.id.slide_img) as ImageView
        imageView.setImageResource(item[position % item.size])

        container.addView(itemView)
        imageView.setOnClickListener {
            var position = position % item.size
            Toast.makeText(context,"$position",Toast.LENGTH_SHORT).show()
        }
        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}