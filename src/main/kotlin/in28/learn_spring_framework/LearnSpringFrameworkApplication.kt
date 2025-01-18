package in28.learn_spring_framework

import in28.learn_spring_framework.game.GameRunner
import in28.learn_spring_framework.game.MarioGame
import in28.learn_spring_framework.game.SuperContraGame
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class LearnSpringFrameworkApplication

fun main(args: Array<String>) {
	val context = runApplication<LearnSpringFrameworkApplication>(*args)

//	val game = SuperContraGame()
//	val runner = GameRunner(game)

	val runner = context.getBean(GameRunner::class.java)
	runner.run()
}
