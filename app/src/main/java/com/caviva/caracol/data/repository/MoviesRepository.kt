package com.caviva.caracol.data.repository

import com.caviva.caracol.data.server.RemoteConnection
import com.caviva.caracol.data.server.toDomain
import com.caviva.caracol.domain.Category
import com.caviva.caracol.domain.Movie

class MoviesRepository(private val apiKey: String) {

    suspend fun getCategories(): Map<Category, List<Movie>> {
        return Category.values().associateWith { category ->
            RemoteConnection
                .service
                .listPopularMovies(apiKey, category.id).results.map { it.toDomain() }
        }
    }
}