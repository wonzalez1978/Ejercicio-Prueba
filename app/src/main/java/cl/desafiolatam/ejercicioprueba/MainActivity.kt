package cl.desafiolatam.ejercicioprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadApi()
    }

    fun loadApi() {
        val service = RetrofitClient.retrofitInstance()
        val call = service.getProductos()
        call.enqueue(object : Callback<ArrayList<Producto>> {
            override fun onResponse(
                call: Call<ArrayList<Producto>>,
                response: Response<ArrayList<Producto>>
            ) {
                Log.d("Main", "${response.isSuccessful}")
                Log.d("Main", "${response.body()}")
            }

            override fun onFailure(call: Call<ArrayList<Producto>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}
