package jsorgensen.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jsorgensen.com.coderswag.R
import jsorgensen.com.coderswag.Utilities.EXTRA_CATAGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATAGORY)
        println(categoryType)
    }
}
