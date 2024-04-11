package com.eniecole.mod2fonctions

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun demarrageVehicule() : Boolean {
    val vitesseMoteur = 0
    val SoCVehicule = 98
    if(SoCVehicule> 2)
        return true
    return false
}
//Fonction d'extension -> On étend la classe LocalDateTime
fun LocalDateTime.showDateTimeInFrench(): String {
    //Création format conversionde date pour
    val formatter = DateTimeFormatter.ofPattern(
        "'le' d MMMM 'à' HH'h'mm", Locale.FRENCH)
    // Formatage du LocalDateTime avec le format donnée
    return this.format(formatter)
}

fun main() {
    val dateNow = LocalDateTime.now()
    println(dateNow.showDateTimeInFrench())
    collections()

    val mapFilmSerie= mutableMapOf(
        "HarryPotter1" to false,
        "IronMan 1" to true
    )
    mapFilmSerie["Inception"] = false
    println("Quelle est la couleur du cheval blanc d'Henri IV")
    val reponseUser  = readln()
    println("La réponse que vous avez donnée est $reponseUser")

}

//Fonction générique
fun <T> concatenate(list: List<T>, separator: String = ", "): String {
    val stringBuilder = StringBuilder()
    for ((index, item) in list.withIndex()) {
        //Si ce n'est pas le premier élément, ajouter le séparateur
        if (index > 0) stringBuilder.append(separator)
        stringBuilder.append(item)
    }
    return stringBuilder.toString()
}
fun collections() {
    val listProducts = mutableListOf(
        "Bureau avec vérins","Chaise de travail Herman Miller",
        "Bureau Steelcase chêne","Bureau Ikea SEKØVA",
        "Bureau blanc","Chaise Think V1", "Armoire métal haute"
    )
    //Ajout avec l'opérateur +=
    listProducts += "Armoire basse"
    //ou avec la méthode add
    listProducts.add("Canapé accueil")
    println(listProducts.filter { it.startsWith("Bureau") }
        .sortedBy { it }
        .count { it.contains("Ikea") })
}
