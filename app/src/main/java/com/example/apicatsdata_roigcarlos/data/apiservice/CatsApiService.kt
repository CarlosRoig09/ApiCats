package com.example.apicatsdata_roigcarlos.data.apiservice
import com.example.apicatsdata_roigcarlos.data.apiservice.model.CatsDto
import com.example.apicatsdata_roigcarlos.data.apiservice.model.ImageDto
import retrofit2.Retrofit
//import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType

private const val BASE_URL = "https://api.thecatapi.com/v1"
@OptIn(ExperimentalSerializationApi::class)
private val retrofit = Retrofit.Builder().addConverterFactory(Json.asConverterFactory(MediaType.get("application/json"))).baseUrl(
    BASE_URL).build()
object CatsApi {
    val retrofitService : CatsApiService by lazy {
        retrofit.create(CatsApiService::class.java)
    }
}
interface  CatsApiService{
    @GET("images/search?limit=10")
    suspend fun getPhotos() : List<ImageDto>
    @GET("breeds")
    suspend fun getCats() : List<CatsDto>
}
