package com.punchedbackend.model

import org.hibernate.annotations.UuidGenerator
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("tb_user_info")
data class UserInfo(
    @Id
    @UuidGenerator
    var id: String,
    val text: String
    // val nickname: String,
    // val password: String,
    // val email: String,
    // val phone: String,
    // @Column(name = "created_at")
    // val created_at: Long = System.currentTimeMillis(),
    // @Column(name = "updated_at")
    // val updated_at: Long = System.currentTimeMillis()
    )