package com.github.ivnmrtk.scheduledisruption.model

import java.time.LocalDate

data class YandexTimetableRequest(
    val from: String,
    val to: String,
    val format: String = "JSON",
    val lang: String = "ru_RU",
    val date: LocalDate,
    val transportTypes: List<TransportType>,
    val system: String = "yandex",
    val showSystems:String = "yandex",
    val offset: Int = 0,
    val limit: Int = 0,
)
