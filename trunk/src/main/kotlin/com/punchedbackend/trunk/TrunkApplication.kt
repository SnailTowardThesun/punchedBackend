package com.punchedbackend.trunk

import com.punchedbackend.model.UserInfo
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*
import java.util.*

@SpringBootApplication
class TrunkApplication

fun main(args: Array<String>) {
    runApplication<TrunkApplication>(*args)
}

@Repository
interface UserRepo: CrudRepository<UserInfo, String>

@Service
class UserService(private val repo: UserRepo) {

    fun findUserInfos(): List<UserInfo> = repo.findAll().toList()

    fun findMessageById(id: String): List<UserInfo> = repo.findById(id).toList()

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
    fun save(item: UserInfo) {
        repo.save(item)
    }
}
@Serializable
data class CreateUserResponse(
    val id: String
)

@RestController
@RequestMapping("/apis/v1")
class UserController {
    // User Interface

    @Autowired
    lateinit var repository: UserService

    @PostMapping("/user")
    fun postUser(@RequestBody body: UserInfo): String {
        repository.save(body)

        val resp = CreateUserResponse(id = "123")

        return Json.encodeToString(resp)
    }


    @GetMapping("/user/{id}")
    fun getUser(@PathVariable("id") id: String): List<UserInfo> {
        return repository.findMessageById(id)
    }
}
