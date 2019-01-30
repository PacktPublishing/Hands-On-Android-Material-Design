package materialdesign.packt.com.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import android.content.DialogInterface
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import android.R.array




class MainActivity : AppCompatActivity() {
    lateinit var Items : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Items = resources.getStringArray(R.array.city_names)
    }

    fun ShowAlertDialog(view: View) {
        AlertDialog.Builder(this)
                .setTitle("This is the Alert Dialos")
                .setMessage("This is the Alert Dialog Massage")
                .setPositiveButton("Yes",
                        DialogInterface.OnClickListener({dialog, which -> Toast.makeText(this,"YEs",Toast.LENGTH_SHORT).show() }))
                .setNegativeButton("No",
                        DialogInterface.OnClickListener({dialog, which -> Toast.makeText(this,"No",Toast.LENGTH_SHORT).show() }))
                .setNeutralButton("Nuetral",
                        DialogInterface.OnClickListener({dialog, which -> Toast.makeText(this,"Nuetral",Toast.LENGTH_SHORT).show() }))
                .setCancelable(false)
                .show()
    }

    fun ShowSingleChoiceDialog(view: View) {
        val SelectedItem = 0
        AlertDialog.Builder(this)
                .setTitle("Select your Hometown")
                .setSingleChoiceItems(Items,SelectedItem){
                    dialgInterface,selectedIndext ->
                    ShowToast(resources.getStringArray(R.array.city_names)
                            .get(selectedIndext)
                            .toString())
                }
                .setPositiveButton("ok",null)
                .setNegativeButton("Cancel",null)
                .show()
    }
    fun ShowMultipleChoiceDialog(view: View) {
        val checkedItems = booleanArrayOf(false, false, false, false,false, false, false, false)
        AlertDialog.Builder(this)
                .setTitle("Select some Cities")
                .setMultiChoiceItems(Items,checkedItems){
                    dialog,index,isChecked ->
                    ShowToast(resources.getStringArray(R.array.city_names)
                            .get(index)
                            .toString())
                }
                .setPositiveButton("ok",null)
                .setNegativeButton("Cancel",null)
                .show()
    }

        fun ShowToast(Msg:String){
        Toast.makeText(this,Msg,Toast.LENGTH_SHORT).show()
    }
}
