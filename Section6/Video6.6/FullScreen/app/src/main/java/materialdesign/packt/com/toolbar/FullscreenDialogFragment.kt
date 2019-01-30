package materialdesign.packt.com.toolbar

import android.app.Dialog
import android.view.Window.FEATURE_NO_TITLE
import android.os.Bundle
import android.support.annotation.NonNull
import android.support.v4.app.DialogFragment
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import kotlinx.android.synthetic.main.fullscreen_dialog_fragment.*


/**
 * Created by ${Mona}
 */
class FullscreenDialogFragment : DialogFragment() {


     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fullscreen_dialog_fragment, container, false)
        return rootView
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        return dialog
    }
}