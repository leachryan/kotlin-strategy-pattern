package dev.leachryan.patterns.core.strategies

import dev.leachryan.patterns.core.model.Dice
import dev.leachryan.patterns.core.model.RollResult

class SkillCheckStrategy(
    private val threshold: Int,
    private val dice: Dice
): RollStrategy {
    override fun roll(): RollResult {
        println("===Roll for skill check: $threshold===")
        val roll = dice.roll()

        val passed = roll >= threshold
        println("===Roll: $roll===")

        if (passed)
            println("===Skill check passed===")
        else
            println("===Skill check failed===")

        return RollResult(passed, roll)
    }
}