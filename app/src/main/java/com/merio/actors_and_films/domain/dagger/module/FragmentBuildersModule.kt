package com.merio.actors_and_films.domain.dagger.module

import com.merio.actors_and_films.feature.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment
}