package study

class SkillsBuilder {
    private val soft: MutableList<String> = mutableListOf()
    private val hard: MutableList<String> = mutableListOf()

    fun soft(value: String) {
        this.soft.add(value)
    }

    fun hard(value: String) {
        this.hard.add(value)
    }

    fun build(): Skills {
        return Skills(soft, hard)
    }
}
