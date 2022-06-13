package com.belajar.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

object RetrofitClient {
//    //buat base urlnya /alamat utama rest api
//    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
//
////    private const val BASE_URL = "http://192.168.1.10/Belajar API/laravel-rest-master/public/api"
////    private const val BASE_URL = "http://127.0.0.1:8000/api"
//
//    //buat instance
//    val instance : Api by lazy {
//        val retrofit = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        retrofit.create(Api::class.java)
//
//    }

    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
//    private const val BASE_URL = "http://192.168.1.10/laravel-rest-master/public/api"
    private val client: Retrofit
        get() {
            val gson = GsonBuilder()
                .setLenient()
                .create()
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client: OkHttpClient = OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(40, TimeUnit.SECONDS)
                .readTimeout(40, TimeUnit.SECONDS)
                .writeTimeout(40, TimeUnit.SECONDS)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()
        }

    val instance: Api
        get() = client.create(Api::class.java)

}