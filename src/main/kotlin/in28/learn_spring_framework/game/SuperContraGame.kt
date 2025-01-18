package in28.learn_spring_framework.game

class SuperContraGame: GamingConsole {
    override fun up() {
        println("jump")
    }
    override fun down() {
        println("down into a hole")
    }
    override fun left() {
        println("stop")
    }
    override fun right() {
        println("accelerate")
    }
}
