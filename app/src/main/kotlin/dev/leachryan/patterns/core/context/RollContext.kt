package dev.leachryan.patterns.core.context

import dev.leachryan.patterns.core.model.RollResult
import dev.leachryan.patterns.core.strategies.RollStrategy

class RollContext(var strategy: RollStrategy? = null) {

    fun execute(): RollResult = strategy?.roll() ?: throw Exception("Roll strategy not set")
}