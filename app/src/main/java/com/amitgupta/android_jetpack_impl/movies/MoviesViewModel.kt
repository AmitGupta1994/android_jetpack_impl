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

    val loadingStatus : LiveData<LoadingStatus> = Transformations.switchMap(
        boundaryCallback.boundaryState, {onBoundaryItemLoaded(it.itemData, it.direction)})

    private fun onBoundaryItemLoaded(itemDate: Date, direction: Direction) : LiveData<LoadingStatus> {
        Timber.d("onBoundaryItemLoaded %s %s ", itemDate, direction)

        val fetchDate = when (direction) {
            Direction.BOTTOM -> Util.addDay(itemDate, -1)
            Direction.TOP -> Util.addDay(itemDate, +1)
            else -> itemDate
        }
        return movieRepository.fetchMore(fetchDate)
    }
}
