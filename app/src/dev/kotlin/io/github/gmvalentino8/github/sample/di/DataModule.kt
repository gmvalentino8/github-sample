package io.github.gmvalentino8.github.sample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import io.github.gmvalentino8.github.sample.data.repositories.RepositoriesDataRepository
import io.github.gmvalentino8.github.sample.data.repositories.SearchDataRepository
import io.github.gmvalentino8.github.sample.data.sources.RepositoriesRemoteDataSource
import io.github.gmvalentino8.github.sample.data.sources.SearchLocalDataSource
import io.github.gmvalentino8.github.sample.data.sources.SearchRemoteDataSource
import io.github.gmvalentino8.github.sample.domain.repositories.RepositoriesRepository
import io.github.gmvalentino8.github.sample.domain.repositories.SearchRepository

@Module
@InstallIn(ActivityRetainedComponent::class)
class DataModule {
    @Provides
    fun provideSearchRepository(
        searchRemoteDataSource: SearchRemoteDataSource,
        searchLocalDataSource: SearchLocalDataSource,
    ): SearchRepository = SearchDataRepository(searchRemoteDataSource, searchLocalDataSource)

    @Provides
    fun provideRepositoriesRepository(
        repositoriesRemoteDataSource: RepositoriesRemoteDataSource
    ): RepositoriesRepository = RepositoriesDataRepository(repositoriesRemoteDataSource)
}
