package com.example.store.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.store.MainActivity

import com.example.store.R
import com.example.store.model.Product

class ProductAdapter(private val context: Context, private val dataset:List<Product>):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){
         class ProductViewHolder(view: View):RecyclerView.ViewHolder(view) {
                 val image:ImageView=view.findViewById(R.id.imageView)
                 val vegname:TextView=view.findViewById(R.id.textView)
                 val rateing:TextView=view.findViewById(R.id.textView2)
         }

         override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
                 val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.productlist,parent,false)
                 return ProductViewHolder(adapterLayout)
         }

         override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
                 val item=dataset[position]
                 holder.image.setImageResource(item.imageResourceId)
                 holder.vegname.text=context.resources.getString(item.productNameResourceId)
                 holder.rateing.text=context.resources.getString(item.rating)
                 holder.itemView.setOnClickListener{
                         //Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
                    if(context is MainActivity){
                        this.context.onProductClicked(item)
                    }
                 }
         }




    override fun getItemCount(): Int {
                 return dataset.size
         }



}