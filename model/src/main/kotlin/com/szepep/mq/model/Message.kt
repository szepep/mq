package com.szepep.mq.model

import com.szepep.mq.proto.MessageProto

data class Message(
    val id: Int,
    val message: String,
)

fun Message.toProto(): MessageProto.Message = MessageProto.Message.newBuilder()
    .setId(id)
    .setMessage(message)
    .build()

fun MessageProto.Message.toModel() = Message(
    id = id,
    message = message
)