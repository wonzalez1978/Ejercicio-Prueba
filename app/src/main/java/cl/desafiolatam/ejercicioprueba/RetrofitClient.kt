package cl.desafiolatam.ejercicioprueba

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://my-json-server.typicode.com"

class RetrofitClient {

    companion object {

        fun retrofitInstance(): ProductosApi {

            val retrofitClient = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofitClient.create(ProductosApi::class.java)
        }
    }
}