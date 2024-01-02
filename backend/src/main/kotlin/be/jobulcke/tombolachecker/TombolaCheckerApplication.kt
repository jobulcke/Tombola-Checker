package be.jobulcke.tombolachecker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TombolaCheckerApplication

fun main(args: Array<String>) {
	runApplication<TombolaCheckerApplication>(*args)
}
