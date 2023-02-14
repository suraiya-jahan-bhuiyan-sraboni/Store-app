package com.example.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.RecyclerView
import com.example.store.adapter.ProductAdapter
import com.example.store.data.DataResource
import com.example.store.model.Product


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val productSet1=DataResource().productResourcelist1()
        val productSet2=DataResource().productResourcelist2()
        val productSet3=DataResource().productResourcelist3()
        val productSet4=DataResource().productResourcelist4()
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView1)
        val recyclerView1=findViewById<RecyclerView>(R.id.recyclerView2)
        val recyclerView2=findViewById<RecyclerView>(R.id.recyclerView3)
        val recyclerView3=findViewById<RecyclerView>(R.id.recyclerView4)
        recyclerView.adapter=ProductAdapter(this,productSet1)
        recyclerView1.adapter=ProductAdapter(this,productSet2)
        recyclerView2.adapter=ProductAdapter(this,productSet3)
        recyclerView3.adapter=ProductAdapter(this,productSet4)
        recyclerView.setHasFixedSize(true)
        recyclerView1.setHasFixedSize(true)
        recyclerView2.setHasFixedSize(true)
        recyclerView3.setHasFixedSize(true)
    }

    fun onProductClicked(context: Product) {
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra("product_name", context.productNameResourceId)
            putExtra("product_img", context.imageResourceId)
            putExtra("product_rating", context.rating)
            putExtra("product_price", context.price) // replace with actual price
            putExtra("product_quantity",context.quantity) // replace with actual quantity
        }
        startActivity(intent)
    }
}