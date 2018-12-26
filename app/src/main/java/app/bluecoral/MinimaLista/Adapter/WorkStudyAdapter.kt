package app.bluecoral.MinimaLista.Adapter

import android.content.Intent
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.bluecoral.MinimaLista.DeleteModel.WorkStudyDeleteToDoActivity
import app.bluecoral.MinimaLista.R
import kotlinx.android.synthetic.main.todo_row.view.*

class WorkStudyAdapter(val todos: List<String>) : RecyclerView.Adapter<WorkStudyAdapter.ToDoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ToDoHolder {
        return ToDoHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.todo_row, parent, false)
        )
    }
    override fun getItemCount(): Int {
        return todos.count()
    }
    override fun onBindViewHolder(parent: ToDoHolder, position: Int) {
        val title = todos[position]
        parent.bindToDo(title)
    }
    class ToDoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        var view : View = v
        var title : String = ""
        init {
            v.setOnClickListener(this)
        }
        fun bindToDo(title: String) {
            this.title = title
            view.textView.text = title
        }
        override fun onClick(v: View?) {
            val intent = Intent(view.context, WorkStudyDeleteToDoActivity::class.java)
            intent.putExtra("title", title)
            ContextCompat.startActivity(view.context, intent, null)

        }
    }
}