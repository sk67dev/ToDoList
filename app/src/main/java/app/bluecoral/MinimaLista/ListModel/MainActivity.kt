package app.bluecoral.MinimaLista.ListModel

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import app.bluecoral.MinimaLista.R
import app.bluecoral.MinimaLista.R.id.toolbar
import app.bluecoral.MinimaLista.TodoModel.*
import kotlinx.android.synthetic.main.activity_main_list.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)

        card1.setOnClickListener {
            val intent1 = Intent(this, MyDayActivity::class.java)
            //my_day.setImageResource(R.drawable.my_day)
            startActivity(intent1)
        }
        card2.setOnClickListener {
            val intent2 = Intent(this, MyWeekendActivity::class.java)
            //my_weekend.setBackgroundResource(R.drawable.my_weekend)
            startActivity(intent2)
        }
        card3.setOnClickListener {
            val intent3 = Intent(this, HomeBillsActivity::class.java)
               // home_bills.setBackgroundResource(R.drawable.home)
            startActivity(intent3)
        }
        card4.setOnClickListener {
            val intent4 = Intent(this, WorkStudyActivity::class.java)
               // work_study.setBackgroundResource(R.drawable.work_study)
            startActivity(intent4)
        }
        card5.setOnClickListener {
            val intent5 = Intent(this, GroceriesActivity::class.java)
            //groceries.setBackgroundResource(R.drawable.shopping)
            startActivity(intent5)
        }
        card6.setOnClickListener {
            val intent6 = Intent(this, InterestsTravelActivity::class.java)
            //interests_travel.setBackgroundResource(R.drawable.interests_travel)
            startActivity(intent6)
        }
        card7.setOnClickListener {
            val intent7 = Intent(this, FriendsFamilyActivity::class.java)
            //friends_family.setBackgroundResource(R.drawable.friends_family)
            startActivity(intent7)
        }
        card8.setOnClickListener {
            val intent8 = Intent(this, OtherActivity::class.java)
            //other.setBackgroundResource(R.drawable.other)
            startActivity(intent8)
        }
        card9.setOnClickListener {
            val intent9 = Intent(this, MyWallActivity::class.java)
            //my_wall.setBackgroundResource(R.drawable.my_wall)
            startActivity(intent9)
        }
        card10.setOnClickListener {
            val intent10 = Intent(this, CleanSheetActivity::class.java)
            startActivity(intent10)
        }
    }
}
