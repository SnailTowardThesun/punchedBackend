package com.punckedbackend.trunk


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {
    @GetMapping("/")
    fun index(@RequestParam("name") name: String) = "Hello, $name!"
}

@SpringBootApplication
class TrunkApplication

fun main(args: Array<String>) {
    runApplication<TrunkApplication>(*args)
}
