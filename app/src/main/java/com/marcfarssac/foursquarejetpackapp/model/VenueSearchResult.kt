package com.marcfarssac.foursquarejetpackapp.model

import androidx.lifecycle.LiveData
import androidx.paging.PagedList

/**
 * VenueSearchResult from a search, which contains LiveData<List<VenueDetails>> holding query data,
 * and a LiveData<String> of network error state.
 */
data class VenueSearchResult(
        val data: LiveData<PagedList<Venue>>,
        val networkErrors: LiveData<String>
)