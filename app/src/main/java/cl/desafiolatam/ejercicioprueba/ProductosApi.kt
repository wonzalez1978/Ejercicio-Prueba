package cl.desafiolatam.ejercicioprueba

import retrofit2.Call
import retrofit2.http.GET

interface ProductosApi {
    @GET("/Himuravidal/FakeAPIdata/products")
    fun getProductos(): Call<ArrayList<Producto>>
}