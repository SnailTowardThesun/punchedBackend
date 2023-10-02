package com.punchedbackend.controller

import com.punchedbackend.model.UserInfo
import kotlinx.serialization.json.Json
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class UserController {
    // User Interface
    @PostMapping("/user")
    fun postUser(@RequestBody() body: String): String {
        val req = Json.decodeFromString<UserInfo>(body)

        req.id = UUID.randomUUID().toString()
        println(req)

        return req.id
    }

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable("id") id: String): String {
        return id
    }
}