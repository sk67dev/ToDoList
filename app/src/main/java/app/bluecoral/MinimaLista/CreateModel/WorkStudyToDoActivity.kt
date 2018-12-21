package app.bluecoral.MinimaLista.CreateModel

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.bluecoral.MinimaLista.R
import kotlinx.android.synthetic.main.activity_create_home_todo.*
import kotlinx.android.synthetic.main.activity_create_work_study_todo.*

class WorkStudyToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_work_study_todo)

        saveButton1.setOnClickListener {
            var title = ""
            if (importantCheckBox1.isChecked) {
                title = "❗️️️️ " + titleEditText1.text.toString()
            } else {
                title = titleEditText1.text.toString()
            }
            var prefs = getSharedPreferences(getString(R.string.SHARED_PREF_NAME), Context.MODE_PRIVATE)
            var todos = prefs.getStringSet(getString(R.string.TODO_STRINGS2), setOf()).toMutableSet()
            todos.add(title)
            prefs.edit().putStringSet("todostrings2", todos).apply()

            finish()
        }
    }
}
