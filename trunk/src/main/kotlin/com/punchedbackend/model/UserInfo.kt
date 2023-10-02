package com.punchedbackend.model

import kotlinx.serialization.Serializable

@Serializable
data class UserInfo(var id: String = "", var name: String = "")