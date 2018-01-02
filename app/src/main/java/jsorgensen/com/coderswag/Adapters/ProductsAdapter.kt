package jsorgensen.com.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import jsorgensen.com.coderswag.Model.Product
import jsorgensen.com.coderswag.R

/**
 * Created by MECH on 1/2/2018.
 */
class ProductsAdapter(val context: Context, val products: List<Product>): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {
    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.product_list_item, parent, false)

        return ProductHolder(view)
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price
        }
    }
}