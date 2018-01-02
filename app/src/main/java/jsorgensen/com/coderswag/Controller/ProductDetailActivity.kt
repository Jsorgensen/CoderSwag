package jsorgensen.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import jsorgensen.com.coderswag.Model.Product
import jsorgensen.com.coderswag.R
import jsorgensen.com.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val imageResourceId = resources.getIdentifier(product.image, "drawable", this.packageName)
        productImage.setImageResource(imageResourceId)
        productTitle.text = product.title
        productPrice.text = product.price
        productDescription.text = product.description
    }

    fun OnAddToCartClick(view: View){
        Toast.makeText(this, "${product.title} ${product.price} has been added to your cart.", Toast.LENGTH_SHORT).show()
    }
}
