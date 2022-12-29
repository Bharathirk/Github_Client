package com.bitflyer.github.di.modules

import android.content.Context
import com.bitflyer.github.app.AppController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    internal fun providesContext(): Context {
        return AppController.instance?.applicationContext!!
    }

}