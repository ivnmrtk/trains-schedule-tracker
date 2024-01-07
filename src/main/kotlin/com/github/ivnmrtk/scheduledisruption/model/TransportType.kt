package com.github.ivnmrtk.scheduledisruption.model

enum class TransportType(
    private val requestValue: String
) {
    PLANE("plane"),
    TRAIN("train"),
    SUBURBAN("suburban"),
    BUS("bus"),
    WATER("water"),
    HELICOPTER("helicopter")
}
