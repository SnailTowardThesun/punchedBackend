package com.punchedbackend.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Table(name = "tb_user_info")
@Entity
data class UserInfo(
    @Id
    var uid: String = UUID.randomUUID().toString(),
    val name: String,
    val email: String,
    val phone: String,
    val username: String,
    val password: String) {
    constructor() : this("", "", "", "", "", "") {
        uid = UUID.randomUUID().toString()
    }
}