package app.bluecoral.MinimaLista.TodoModel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import app.bluecoral.MinimaLista.Adapter.ShoppingAdapter
import app.bluecoral.MinimaLista.CreateModel.HomeToDoActivity
import app.bluecoral.MinimaLista.CreateModel.ShoppingToDoActivity
import app.bluecoral.MinimaLista.R

import kotlinx.android.synthetic.main.activity_shopping_todo.*
import kotlinx.android.synthetic.main.content_home.*

class ShoppingActivity : AppCompatActivity() {

    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: ShoppingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_todo)
        setSupportActionBar(toolbar)

        //Add intent to go to HomeToDoActivity
        fab.setOnClickListener { view ->
            val intent = Intent(this, ShoppingToDoActivity::class.java )
            startActivity(intent)
        }
    }
    override fun onResume() {
        super.onResume()
        updateRecycler()
    }
    fun updateRecycler() {
        var prefs = getSharedPreferences(getString(R.string.SHARED_PREF_NAME), Context.MODE_PRIVATE)
        var todos = prefs.getStringSet(getString(R.string.TODO_STRINGS3), setOf()).toMutableSet()
        println(todos)

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        adapter = ShoppingAdapter(todos.toList())
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
            prefs.edit().putStringSet(getString(R.string.TODO_STRINGS3), null).apply()
            updateRecycler()

            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
