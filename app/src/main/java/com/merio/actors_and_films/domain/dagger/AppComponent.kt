package com.merio.actors_and_films.domain.dagger

import android.app.Application
import com.merio.actors_and_films.AFApplication
import com.merio.actors_and_films.domain.dagger.module.ActivityBuildersModule
import com.merio.actors_and_films.domain.dagger.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class,
        AppModule::class
    ]
)
interface AppComponent: AndroidInjector<AFApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
