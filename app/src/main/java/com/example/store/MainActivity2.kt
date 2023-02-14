package com.example.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val productName = intent.getIntExtra("product_name",R.string.veg_0)
        val productImgResId = intent.getIntExtra("product_img", R.drawable._0)
        val productRating = intent.getIntExtra("product_rating",R.string.rate)
        val productPrice = intent.getIntExtra("product_price",R.string.price)
        val productQuantity = intent.getIntExtra("product_quantity",R.string.quantity)
        val imageView:ImageView=findViewById(R.id.imageView2)
        val nameText:TextView=findViewById(R.id.textView1)
        val priceText:TextView=findViewById(R.id.textView7)
        val ratee:TextView=findViewById(R.id.textView8)
        val quantityText:TextView=findViewById(R.id.textView3)
        imageView.setImageResource(productImgResId)
        nameText.setText(productName)
        priceText.setText(productPrice)
        ratee.setText(productRating)
        quantityText.setText(productQuantity)
    }
}