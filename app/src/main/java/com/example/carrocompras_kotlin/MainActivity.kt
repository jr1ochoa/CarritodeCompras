package com.example.carrocompras_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carrocompras_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AdaptadorProducto

    var productlist = ArrayList<Producto>()
    var carrito = ArrayList<Producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addproducts()

        setupRecyclerView()
    }

    fun setupRecyclerView() {
        binding.rvListaProductos.layoutManager = LinearLayoutManager(this)
        adapter = AdaptadorProducto(this, binding.tvCantProductos, binding.btnVerCarro, productlist, carrito)
        binding.rvListaProductos.adapter = adapter
    }

    fun addproducts() {
        productlist.add(Producto("101", "Sansung S24 Ultra", "Do What You Can't", 1400.00))
        productlist.add(Producto("102", "Iphone 15 Pro Max", "Think Differen", 1299.00))
        productlist.add(Producto("103", "Huawei P60 Pro", "Make It Possible ", 1100.00))
        productlist.add(Producto("104", "Google Pixel 8 Pro", "Don't be evil", 999.00))
        productlist.add(Producto("105", "Nothing Phone 2", "Impossible is nothing", 699.00))
    }
}