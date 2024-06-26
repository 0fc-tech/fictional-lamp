package com.eniecole.mod4ratingvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RatingViewModel : ViewModel() {
    private val _ratingState = MutableStateFlow<RatingState>(RatingState.Initial)
    val ratingState: StateFlow<RatingState> = _ratingState

    fun updateRating(rating: Int) {
            if (rating >= 8) {
                _ratingState.value = RatingState.Success(rating)
            } else {
                _ratingState.value = RatingState.RequestFeedback(rating)
            }
    }
}

sealed class RatingState(var note : Int? = null) {
    data object Initial : RatingState()
    class Success(note: Int?) : RatingState(note)
    class RequestFeedback(note: Int?) : RatingState(note)
}
