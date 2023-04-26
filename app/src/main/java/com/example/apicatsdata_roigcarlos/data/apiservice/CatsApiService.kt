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
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

private const val BASE_URL = "https://api.thecatapi.com/v1/"
private const val API_KEY = "live_ezoQO0tHaJktwB0l4pry5M7KoRHojpDgsLaWG4DZ8QKinr6jlQg5c3dXiEzwGpJn"
@OptIn(ExperimentalSerializationApi::class)
private val retrofit = Retrofit.Builder().addConverterFactory(Json.asConverterFactory("application/json".toMediaType())).baseUrl(
    BASE_URL).build()
object CatsApi {
    val retrofitService : CatsApiService by lazy {
        retrofit.create(CatsApiService::class.java)
    }
}
interface  CatsApiService{

    @GET("breeds")
    suspend fun getCats(@Query("limit") limit: Int) : List<CatsDto>
    @Headers("x-api-key: $API_KEY")
    @GET("images/search")
    suspend fun getCatPhoto(@Query("breed_id") id : String?, @Query("limit") limit : Int) : List<ImageDto>
}
