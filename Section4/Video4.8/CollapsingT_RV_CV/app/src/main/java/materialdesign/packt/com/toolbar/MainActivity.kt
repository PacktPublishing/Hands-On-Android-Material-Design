package materialdesign.packt.com.toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val List: ArrayList<MyList> = ArrayList()
    val UserNames: ArrayList<String> = ArrayList()
    val UserImg: ArrayList<Int> = ArrayList()
    val UserDcs: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.activity_main_toolbar))
        // Creates a vertical Layout Manager
        addUserNames()
        addUserDcs()
        addUserImg()
        AddList()
        rec_main.layoutManager = LinearLayoutManager(this)
      //  rec_main.layoutManager = GridLayoutManager(this, 3)
        rec_main.adapter = MainAdapter(List,this)
    }
    fun AddList(){
        for(i in 0 until 7){
            var list : MyList = MyList()
            list.userName = UserNames[i]
            list.userMsg = UserDcs[i]
            list.userImg = UserImg[i]
            List.add(list)
        }
    }
    fun addUserNames() {
        UserNames.add("User1")
        UserNames.add("User2")
        UserNames.add("User3")
        UserNames.add("User4")
        UserNames.add("User5")
        UserNames.add("User6")
        UserNames.add("User7")
    }
    fun addUserDcs() {
        UserDcs.add("Dcs1")
        UserDcs.add("Dcs2")
        UserDcs.add("Dcs3")
        UserDcs.add("Dcs4")
        UserDcs.add("Dcs5")
        UserDcs.add("Dcs6")
        UserDcs.add("Dcs7")
    }
    fun addUserImg() {
        UserImg.add(R.drawable.img_user_list)
        UserImg.add(R.drawable.img_user_list)
        UserImg.add(R.drawable.img_user_list)
        UserImg.add(R.drawable.img_user_list)
        UserImg.add(R.drawable.img_user_list)
        UserImg.add(R.drawable.img_user_list)
        UserImg.add(R.drawable.img_user_list)
    }

}
