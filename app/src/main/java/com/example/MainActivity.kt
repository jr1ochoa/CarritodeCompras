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
        productlist.add(Producto("101", "Product No 1", "Made with natural ingredients", 40.00))
        productlist.add(Producto("102", "Product No 2", "Made with premium materials", 30.00))
        productlist.add(Producto("103", "Product No 3", "Wooden chair made with natural materials", 90.00))
        productlist.add(Producto("104", "Product No 4", "Made with natural ingredients", 50.00))
        productlist.add(Producto("105", "Product No 5", "Brand new high heels shoes", 80.00))
    }
}