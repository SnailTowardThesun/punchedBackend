package com.punchedbackend.trunk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.punchedbackend.controller"])
class TrunkApplication

fun main(args: Array<String>) {
    runApplication<TrunkApplication>(*args)
}
