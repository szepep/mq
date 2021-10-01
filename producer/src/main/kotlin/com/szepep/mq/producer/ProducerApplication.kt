package com.szepep.mq.producer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProducerApplication

fun main(args: Array<String>) {

    val msg = com.szepep.mq.proto.MessageProto.Message.newBuilder()

    runApplication<ProducerApplication>(*args)
}
