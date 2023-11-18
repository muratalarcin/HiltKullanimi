package com.muratalarcin.hiltkullanimi.di;

import com.muratalarcin.hiltkullanimi.Adres;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    public Adres provideAdres() {

        return new Adres("Kadıköy/İSTANBUL");

    }
}
