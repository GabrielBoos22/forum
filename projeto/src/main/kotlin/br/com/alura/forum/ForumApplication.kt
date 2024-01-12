package br.com.alura.forum

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("br.com.alura.forum")
class ForumApplication

fun main(args: Array<String>) {
	runApplication<ForumApplication>(*args)
}
