package com.punchedbackend.repo

import com.punchedbackend.model.UserInfo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : CrudRepository<UserInfo, String>