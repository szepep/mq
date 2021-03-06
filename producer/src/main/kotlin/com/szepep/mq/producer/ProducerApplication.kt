package com.szepep.mq.producer

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class ProducerApplication : CommandLineRunner {
    override fun run(vararg args: String) {
        Thread.sleep(100_000)
    }

}

fun main(args: Array<String>) {

    runApplication<ProducerApplication>(*args)
}
