package com.koto.chirp.infra.database.mappers

import com.koto.chirp.domain.model.User
import com.koto.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail,
    )
}