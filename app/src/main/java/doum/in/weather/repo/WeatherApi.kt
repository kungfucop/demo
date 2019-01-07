package doum.`in`.weather.repo

import doum.`in`.weather.model.Weather
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface WeatherApi {
    @GET("data/2.5/forecast")
    fun weatherInCity(@Query("zip") zip: String): Observable<List<Weather>>
}