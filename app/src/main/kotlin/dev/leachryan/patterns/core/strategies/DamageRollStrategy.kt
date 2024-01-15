package dev.leachryan.patterns.core.strategies

import dev.leachryan.patterns.core.model.Dice
import dev.leachryan.patterns.core.model.RollResult

class DamageRollStrategy(
    private val dice: Dice
) : RollStrategy {
    override fun roll(): RollResult {
        println("===Roll for damage===")

        val roll = dice.roll()

        println("===Damage roll: ${roll}===")

        return RollResult(true, roll)
    }
}