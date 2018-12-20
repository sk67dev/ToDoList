package app.bluecoral.MinimaLista.TodoModel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import app.bluecoral.MinimaLista.Adapter.OtherAdapter
import app.bluecoral.MinimaLista.CreateModel.CreateToDoActivity
import app.bluecoral.MinimaLista.R

import kotlinx.android.synthetic.main.activity_other_todo.*
import kotlinx.android.synthetic.main.content_home.*

class OtherActivity : AppCompatActivity() {

    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: OtherAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_todo)
        setSupportActionBar(toolbar5)

        //Add intent to go to CreateToDoActivity
        fab5.setOnClickListener { view ->
            val intent = Intent(this, CreateToDoActivity::class.java )
            startActivity(intent)
        }
    }
    override fun onResume() {
        super.onResume()
        updateRecycler()
    }
    fun updateRecycler() {
        var prefs = getSharedPreferences(getString(R.string.SHARED_PREF_NAME), Context.MODE_PRIVATE)
        var todos = prefs.getStringSet(getString(R.string.TODO_STRINGS), setOf()).toMutableSet()
        println(todos)

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        adapter = OtherAdapter(todos.toList())
        recyclerView.adapter = adapter
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.action_delete_all) {
            var prefs = getSharedPreferences(getString(
                R.string.SHARED_PREF_NAME
            ), Context.MODE_PRIVATE)
            prefs.edit().putStringSet(getString(R.string.TODO_STRINGS), null).apply()
            updateRecycler()

            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
