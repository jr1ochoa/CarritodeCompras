package com.example.carrocompras_kotlin

import java.io.Serializable

data class Producto(
    var idProducto: String,
    var nomProducto: String,
    var descripcion: String,
    var precio: Double,
    val imagenUrl: String
): Serializable

data class CarritoProducto (
    var producto: Producto,
    var cantidad: Int
): Serializable
