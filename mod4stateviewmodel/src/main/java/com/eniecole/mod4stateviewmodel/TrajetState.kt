package com.eniecole.mod4stateviewmodel

abstract class TrajetState {}

class TrajetTrouve(trajet: Trajet) : TrajetState()

class TrajetIntrouvable(
    val messagePourquoi : String) : TrajetState(){
}