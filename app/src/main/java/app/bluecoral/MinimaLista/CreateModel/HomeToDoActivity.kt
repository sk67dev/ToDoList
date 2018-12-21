package app.bluecoral.MinimaLista.CreateModel

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import app.bluecoral.MinimaLista.R
import app.bluecoral.MinimaLista.R.id.titleEditText1
import kotlinx.android.synthetic.main.activity_create_home_todo.*

class HomeToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_home_todo)

        saveButton.setOnClickListener {
            var title = ""
            if (importantCheckBox.isChecked) {
                title = "❗️️️️ " + titleEditText.text.toString()
        } else {
                title = titleEditText.text.toString()
            }
            var prefs = getSharedPreferences(getString(R.string.SHARED_PREF_NAME), Context.MODE_PRIVATE)
            var todos = prefs.getStringSet(getString(R.string.TODO_STRINGS1), setOf()).toMutableSet()
            todos.add(title)
            prefs.edit().putStringSet("todostrings1", todos).apply()

            finish()
        }
    }
}
