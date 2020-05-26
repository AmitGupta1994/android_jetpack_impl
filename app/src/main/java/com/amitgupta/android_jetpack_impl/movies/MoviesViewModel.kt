package com.amitgupta.android_jetpack_impl.movies

import android.graphics.Movie
import androidx.lifecycle.LiveData

class MoviesViewModel {

//    private val boundaryCallback = MovieBoundaryCallback()

    val movies = getMovieSource()

    private fun getMovieSource(): LiveData<PagedList<Movie>> {
        val dataSourceFactory = movieRepository.getMovieDataSourceFactory()

        return LivePagedListBuilder(dataSourceFactory, MovieBoundaryCallback.DATABASE_PAGE_SIZE)
            .setBoundaryCallback(boundaryCallback)
            .build()
    }
}
