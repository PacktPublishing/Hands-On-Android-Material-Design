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
import java.util.*
import android.widget.DatePicker
import android.app.DatePickerDialog
import java.text.DateFormat
import android.widget.TimePicker
import android.app.TimePickerDialog
import android.support.design.widget.BottomSheetDialog


class MainActivity : AppCompatActivity() {
    lateinit var mCalendar: Calendar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCalendar = Calendar.getInstance()
    }

    fun ShowTimePickerDialog(view: View) {
        val datePickerDialog = DatePickerDialog(this,R.style.CustomDialogTheme, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            mCalendar.set(Calendar.YEAR, year)
            mCalendar.set(Calendar.MONTH, monthOfYear)
            mCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            val date = DateFormat.getDateInstance(DateFormat.MEDIUM).format(mCalendar.time)
            Toast.makeText(this, "Date : $date", Toast.LENGTH_SHORT).show()
        }, mCalendar.get(Calendar.YEAR),
                mCalendar.get(Calendar.MONTH),
                mCalendar.get(Calendar.DAY_OF_MONTH))
        datePickerDialog.show()
    }

fun ShowDatePickerDialog(view: View) {
    val timePickerDialog = TimePickerDialog(this,
            TimePickerDialog.OnTimeSetListener{
                timePicker,hourOfDay,minute ->
                mCalendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                mCalendar.set(Calendar.MINUTE, minute)
                val time = DateFormat.getTimeInstance(DateFormat.SHORT).format(mCalendar.time)
                Toast.makeText(this, "Time : $time", Toast.LENGTH_SHORT).show()
            }, mCalendar.get(Calendar.HOUR_OF_DAY),
            mCalendar.get(Calendar.MINUTE),true)
    timePickerDialog.show()

}

}
