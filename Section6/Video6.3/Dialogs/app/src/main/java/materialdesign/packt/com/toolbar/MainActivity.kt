package materialdesign.packt.com.toolbar

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.support.v7.app.AlertDialog
import android.view.View


class MainActivity : AppCompatActivity() {
    lateinit var Items : Array<String>
    lateinit var dialog : AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Items = resources.getStringArray(R.array.city_names)
    }

    fun ShowAlertDialog(view: View) {
        dialog = AlertDialog.Builder(this)
                .setView(R.layout.custom_dialog)
                /*     .setTitle("This is the Alert Dialog Title")
                     .setMessage("This is the Alert Dialog Massage.This is the Alert Dialog Massage.This is the Alert Dialog Massage.")
                     .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which -> ShowToast("Yes") })
                     .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which -> ShowToast("No") })
                     .setNeutralButton("Neutral", DialogInterface.OnClickListener { dialog, which -> ShowToast("Neutral") })
                     .setCancelable(false)*/
                .show()
    }

    fun ShowSingleChoiceDialog(view: View) {
        val SelectedItem = 0
        AlertDialog.Builder(this , R.style.CustomDialogTheme)
                .setTitle("Select your HomeTown")
                .setSingleChoiceItems(Items, SelectedItem) {
                    dialogInterface,
                    selectedIndex ->
                    ShowToast(resources.getStringArray(R.array.city_names)
                            .get(selectedIndex)
                            .toString())}
                .setPositiveButton("Ok", null)
                .setNegativeButton("Cancel", null)
                .show()
    }
    fun ShowMultipleChoiceDialog(view: View) {

        val checkedItems = booleanArrayOf(false, false, false, false,false, false, false, false)
        AlertDialog.Builder(this)
                .setTitle("Select Some Cities")
                .setMultiChoiceItems(Items,
                        checkedItems
                ) { dialog, index, isChecked ->
                    ShowToast(resources.getStringArray(R.array.city_names)
                            .get(index)
                            .toString())}
                .setPositiveButton("Ok", null)
                .setNegativeButton("Cancel", null)
                .show()
    }

        fun ShowToast(Msg:String){
        Toast.makeText(this,Msg,Toast.LENGTH_SHORT).show()
    }
    fun DialogDismiss(view:View){
        dialog.dismiss()

    }
}
