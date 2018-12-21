package app.bluecoral.MinimaLista.DeleteModel

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.bluecoral.MinimaLista.R
import kotlinx.android.synthetic.main.activity_delete_home_bills_to_do.*

class WorkStudyDeleteToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_work_study_todo)

        val todo = intent.extras.getString("title")
        toDoTextView.text = todo

        completeButton.setOnClickListener {

            var prefs = getSharedPreferences(getString(R.string.SHARED_PREF_NAME), Context.MODE_PRIVATE)
            var todos = prefs.getStringSet(getString(R.string.TODO_STRINGS2), setOf()).toMutableSet()

            todos.remove(todo)

            prefs.edit().putStringSet(getString(R.string.TODO_STRINGS2), todos).apply()

            finish()
        }
    }
}