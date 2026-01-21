package com.koto.chirp.api.mappers

import com.koto.chirp.api.dto.AuthenticatedUserDto
import com.koto.chirp.api.dto.UserDto
import com.koto.chirp.domain.model.AuthenticatedUser
import com.koto.chirp.domain.model.User

fun AuthenticatedUser.toDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toDto(),
        accessToken = accessToken,
        refreshToken = refreshToken,
    )
}

fun User.toDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified,
    )
}