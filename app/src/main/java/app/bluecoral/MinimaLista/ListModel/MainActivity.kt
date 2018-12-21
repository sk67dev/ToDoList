package app.bluecoral.MinimaLista.ListModel

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import app.bluecoral.MinimaLista.CreateModel.HomeToDoActivity
import app.bluecoral.MinimaLista.CreateModel.WorkStudyToDoActivity
import app.bluecoral.MinimaLista.R
import app.bluecoral.MinimaLista.TodoModel.*
import kotlinx.android.synthetic.main.activity_main_list.*

class MainActivity : AppCompatActivity() {

    //Create new list feature on the application.
    //This list activity will need to be the first activity. The second activity will
    // be the todos.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)

        card1.setOnClickListener {
            val intent1 = Intent(this, HomeActivity::class.java)
                home.setBackgroundResource(R.drawable.home)
                startActivity(intent1)
        }
        card2.setOnClickListener {
            val intent2 = Intent(this, WorkStudyActivity::class.java)
                work_study.setBackgroundResource(R.drawable.work_study)
                startActivity(intent2)
        }
        card3.setOnClickListener {
            val intent3 = Intent(this, ShoppingActivity::class.java)
            shopping.setBackgroundResource(R.drawable.shopping)
            startActivity(intent3)
        }
        card4.setOnClickListener {
            val intent4 = Intent(this, FriendsFamilyActivity::class.java)
            friends_family.setBackgroundResource(R.drawable.friends_family)
            startActivity(intent4)
        }
        card5.setOnClickListener {
            val intent5 = Intent(this, InterestsTravelActivity::class.java)
            interests_travel.setBackgroundResource(R.drawable.interests_travel)
            startActivity(intent5)
        }
        card6.setOnClickListener {
            val intent6 = Intent(this, OtherActivity::class.java)
            other.setBackgroundResource(R.drawable.other)
            startActivity(intent6)
        }
    }
}
