package com.example.recycleviewapp.api
import com.example.recycleviewapp.PhotoRepository
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Path

interface  UserAPIService {
    @GET("users")
    fun getUsers(): Call<List<PhotoRepository>>

    @GET("photos")
    fun getPhotos(): Call<List<PhotoRepository>>

    @GET("users/{userId}")
    fun getUser(@Path("userId") id : String):Call<PhotoRepository>
    companion object{
        //Companion object is same like java static object
        val API_URL ="https://jsonplaceholder.typicode.com"
        fun create():UserAPIService{

            val retrofit = Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(UserAPIService::class.java)
        }


    }

}



class RetrofitConfigurations {

}