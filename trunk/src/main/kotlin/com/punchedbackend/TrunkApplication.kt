package com.punchedbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.punchedbackend.controller", "com.punchedbackend.service", "com.punchedbackend.repo"])
class TrunkApplication

fun main(args: Array<String>) {
    runApplication<TrunkApplication>(*args)
}

