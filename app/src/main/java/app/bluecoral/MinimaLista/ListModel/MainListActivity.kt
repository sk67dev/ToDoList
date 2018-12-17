package app.bluecoral.MinimaLista.ListModel

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import app.bluecoral.MinimaLista.R

import kotlinx.android.synthetic.main.activity_main_list.*

class MainListActivity : AppCompatActivity() {

    //Create new list feature on the application.
    //This list activity will need to be the first activity. The second activity will
    // be the todos.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
