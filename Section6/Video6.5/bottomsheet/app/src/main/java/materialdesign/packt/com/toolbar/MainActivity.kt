package materialdesign.packt.com.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.support.design.widget.BottomSheetDialog


class MainActivity : AppCompatActivity() {
    var mBottomSheetDialog: BottomSheetDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun ShowBottomSheetDialog(view: View) {
        val bottomSheetLayout = layoutInflater.inflate(R.layout.bottom_sheet_dialog,null)
        mBottomSheetDialog = BottomSheetDialog(this)
        mBottomSheetDialog!!.setContentView(bottomSheetLayout)
        mBottomSheetDialog!!.show()
    }

}
