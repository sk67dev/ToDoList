package app.bluecoral.MinimaLista.CreateModel

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.bluecoral.MinimaLista.R
import kotlinx.android.synthetic.main.activity_create_groceries_todo.*

class GroceriesToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_groceries_todo)

        saveButton2.setOnClickListener {
            var title = ""
            if (importantCheckBox2.isChecked) {
                title = "❗️️️️ " + titleEditText2.text.toString()
            } else {
                title = titleEditText2.text.toString()
            }
            var prefs = getSharedPreferences(getString(R.string.SHARED_PREF_NAME), Context.MODE_PRIVATE)
            var todos = prefs.getStringSet(getString(R.string.TODO_STRINGS3), setOf()).toMutableSet()
            todos.add(title)
            prefs.edit().putStringSet("todostrings3", todos).apply()

            finish()
        }
    }
}
