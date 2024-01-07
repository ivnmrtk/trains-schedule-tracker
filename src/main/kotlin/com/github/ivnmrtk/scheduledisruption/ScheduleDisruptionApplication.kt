package com.github.ivnmrtk.scheduledisruption

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ScheduleDisruptionApplication

fun main(args: Array<String>) {
    runApplication<ScheduleDisruptionApplication>(*args)
}
