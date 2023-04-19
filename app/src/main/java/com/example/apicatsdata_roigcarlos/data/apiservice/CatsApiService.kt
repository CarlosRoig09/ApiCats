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
import retrofit2.http.FieldMap
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

private const val BASE_URL = "https://api.thecatapi.com"
private const val API_KEY = " live_ezoQO0tHaJktwB0l4pry5M7KoRHojpDgsLaWG4DZ8QKinr6jlQg5c3dXiEzwGpJn "
@OptIn(ExperimentalSerializationApi::class)
private val retrofit = Retrofit.Builder().addConverterFactory(Json.asConverterFactory(MediaType.get("application/json"))).baseUrl(
    BASE_URL).build()
object CatsApi {
    val retrofitService : CatsApiService by lazy {
        retrofit.create(CatsApiService::class.java)
    }
}
interface  CatsApiService{
    @Headers("x-api-key: $API_KEY")
    @GET("./v1/breeds")
    suspend fun getCatPhotos() : List<ImageDto>
    @GET("./v1/breeds")
    suspend fun getCats() : List<CatsDto>
}
