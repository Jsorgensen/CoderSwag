package jsorgensen.com.coderswag.Services

import jsorgensen.com.coderswag.Model.Category
import jsorgensen.com.coderswag.Model.Product

/**
 * Created by MECH on 1/2/2018.
 */
object DataService {

    val productDescription = "Description: lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum"

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1", productDescription),
            Product("Devslopes Hat Black", "$20", "hat2", productDescription),
            Product("Devslopes Hat White", "$18", "hat3", productDescription),
            Product("Devslopes Hat Snapback", "$22", "hat4", productDescription),
            Product("Devslopes Graphic Beanie", "$18", "hat1", productDescription),
            Product("Devslopes Hat Black", "$20", "hat2", productDescription),
            Product("Devslopes Hat White", "$18", "hat3", productDescription),
            Product("Devslopes Hat Snapback", "$22", "hat4", productDescription)
    )

    val hoodies = listOf(
           Product("Devslopes Hoodie Gray", "$28", "hoodie1", productDescription),
           Product("Devslopes Hoodie Red", "$32", "hoodie2", productDescription),
           Product("Devslopes Gray Hoodie", "$28", "hoodie3", productDescription),
           Product("Devslopes Black Hoodie", "$32", "hoodie4", productDescription),
           Product("Devslopes Hoodie Gray", "$28", "hoodie1", productDescription),
           Product("Devslopes Hoodie Red", "$32", "hoodie2", productDescription),
           Product("Devslopes Gray Hoodie", "$28", "hoodie3", productDescription),
           Product("Devslopes Black Hoodie", "$32", "hoodie4", productDescription)
    )

    val shirts = listOf(
           Product("Devslopes Shirt Black", "$18", "shirt1", productDescription),
           Product("Devslopes Badge Light Gray", "$20", "shirt2", productDescription),
           Product("Devslopes Logo Shirt Red", "$22", "shirt3", productDescription),
           Product("Devslopes Hustle", "$22", "shirt4", productDescription),
           Product("Kickflip Studios", "$18", "shirt5", productDescription),
           Product("Devslopes Shirt Black", "$18", "shirt1", productDescription),
           Product("Devslopes Badge Light Gray", "$20", "shirt2", productDescription),
           Product("Devslopes Logo Shirt Red", "$22", "shirt3", productDescription),
           Product("Devslopes Hustle", "$22", "shirt4", productDescription),
           Product("Kickflip Studios", "$18", "shirt5", productDescription)
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product>{
        return when(category){
            "HATS" -> hats
            "HOODIES" -> hoodies
            "SHIRTS" -> shirts
            else -> digitalGoods
        }
    }
}