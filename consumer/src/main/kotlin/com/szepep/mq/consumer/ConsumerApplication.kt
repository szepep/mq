package com.szepep.mq.consumer

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConsumerApplication : CommandLineRunner {
    override fun run(vararg args: String) {
        Thread.sleep(100_000)
    }

}

fun main(args: Array<String>) {

    runApplication<ConsumerApplication>(*args)
}