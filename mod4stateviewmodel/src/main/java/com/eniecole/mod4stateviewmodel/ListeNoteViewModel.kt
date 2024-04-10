package com.eniecole.mod4stateviewmodel

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlin.random.Random

class ListeNoteViewModel : ViewModel() {
    //C'est privé (mutable) car seul le VM peut ajouter des éléments dedans
    private var _listNotes = MutableStateFlow<List<Double>>(emptyList())
    //C'est public, ici c'est l'UI qui "écoutera" listNotes et recomposera à chaque nouvelle
    // entrée dans le Flux
    val listNotes : StateFlow<List<Double>> =_listNotes

    init{
        _listNotes.value = List(10){ Random.nextDouble(0.0,20.0)}
    }

    fun ajouterNote(note: Double){
        _listNotes.value += note
    }


}