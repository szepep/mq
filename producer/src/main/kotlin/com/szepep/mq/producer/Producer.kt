package com.szepep.mq.producer

import mu.KotlinLogging
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


val log = KotlinLogging.logger {}

@Component
class Producer(
    private val template: RabbitTemplate,
    private val queue: Queue,
) {

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    fun send() {
        val message = "Hello World!"
        template.convertAndSend(queue.name, message)
        log.info { " [x] Sent '$message'" }
    }
}