package com.punchedbackend.service

import com.punchedbackend.model.UserInfo
import com.punchedbackend.repo.UserRepo
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(val repo: UserRepo) {

    fun findUserInfos(): List<UserInfo> = repo.findAll().toList()

    fun findMessageById(id: String): List<UserInfo> = repo.findById(id).toList()

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()

    fun save(item: UserInfo) {
        var obj = repo.save(item)
    }

}
