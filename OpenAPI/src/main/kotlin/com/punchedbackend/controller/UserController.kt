package com.punchedbackend.controller

import com.punchedbackend.model.UserInfo
import com.punchedbackend.service.UserService
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@Serializable
data class CreateUserRequest(
    val name: String,
    val email: String,
    val phone: String,
    val username: String,
    val password: String
)

@Serializable
data class CreateUserResponse(
    val id: String
)

@RestController
@RequestMapping("/apis/v1")
class UserController() {
    // User Interface

    @Autowired
    lateinit var repository: UserService

    @PostMapping("/user")
    fun postUser(@RequestBody body: CreateUserRequest): String {
        // do check post info

        val obj = UserInfo(
            name = body.name,
            email = body.email,
            phone = body.phone,
            username = body.username,
            password = body.password
        )

        repository.save(obj)

        val resp = CreateUserResponse(id = obj.uid)

        return Json.encodeToString(resp)
    }

    @GetMapping("/user/{uid}")
    fun getUser(@PathVariable("uid") uid: String): List<UserInfo> {
        return repository.findMessageById(uid)
    }
}
