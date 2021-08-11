package com.merio.actors_and_films.domain.dagger.module

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun getString(): String {
        return "Привет Максимка!"
    }
}
