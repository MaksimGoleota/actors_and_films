package com.merio.actors_and_films.domain.network

import android.provider.ContactsContract
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


class NetworkService {
    var firstname: String? = null
    var lastname: String? = null

    interface IRest {
        @get:GET("/your/url")
        val name: Call<ContactsContract.Contacts.Data?>?
    }

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://your.base.url.ru/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
