package in28.learn_spring_framework.game

import org.springframework.stereotype.Component

@Component
class GameRunner(private val game: GamingConsole) {
    fun run() {
        game.up()
        game.left()
        game.down()
        game.right()
    }
}
