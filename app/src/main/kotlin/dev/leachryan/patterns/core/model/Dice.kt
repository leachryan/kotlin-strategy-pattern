package dev.leachryan.patterns.core.model

class Dice(private val sides: Int) {

    fun roll(): Int = (1..sides).random()
}
