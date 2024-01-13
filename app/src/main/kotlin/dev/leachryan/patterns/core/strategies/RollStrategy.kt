package dev.leachryan.patterns.core.strategies

import dev.leachryan.patterns.core.model.Dice
import dev.leachryan.patterns.core.model.RollResult

interface RollStrategy {

    fun roll(): RollResult
}
