package jsorgensen.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import jsorgensen.com.coderswag.Adapters.CategoryAdapter
import jsorgensen.com.coderswag.Model.Category
import jsorgensen.com.coderswag.R
import jsorgensen.com.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
                DataService.categories)
        categoryListView.adapter = adapter
    }
}
