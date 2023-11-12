package com.punchedbackend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class pongController {
    @GetMapping("/ping")
    fun pong() = "pong"
}