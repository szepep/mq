package com.szepep.mq.producer

import org.springframework.amqp.core.Queue
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
class MQConfig(private val props: MQConfigProps) {

    @Bean
    fun queue() = Queue(props.name)
}

@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = "mq")
data class MQConfigProps(
    var name: String = ""
)