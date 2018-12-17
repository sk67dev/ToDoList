package app.bluecoral.MinimaLista.TodoModel

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import app.bluecoral.MinimaLista.R
import kotlinx.android.synthetic.main.activity_delete_to_do.*

class DeleteToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_to_do)

        val todo = intent.extras.getString("title")
        toDoTextView.text = todo

        completeButton.setOnClickListener {

            var prefs = getSharedPreferences(getString(R.string.SHARED_PREF_NAME), Context.MODE_PRIVATE)
            var todos = prefs.getStringSet(getString(R.string.TODO_STRINGS), setOf()).toMutableSet()

            todos.remove(todo)

            prefs.edit().putStringSet(getString(R.string.TODO_STRINGS), todos).apply()

            finish()
        }
    }
}
