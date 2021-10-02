package com.szepep.mq.consumer

import mu.KotlinLogging
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.annotation.RabbitHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component


val log = KotlinLogging.logger {}

@Component
@RabbitListener(queues = ["hello"])
class Consumer {
    @RabbitHandler
    fun receive(`in`: String) {
        log.info { " [x] Received '$`in`'" }
    }
}

@Configuration(proxyBeanMethods = false)
class MQConfig {

    @Bean
    fun queue() = Queue("hello")

}