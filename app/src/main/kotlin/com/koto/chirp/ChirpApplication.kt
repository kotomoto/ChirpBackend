package com.koto.chirp

import Test
import com.koto.chirp.infra.database.entities.UserEntity
import com.koto.chirp.infra.database.repositories.UserRepository
import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class ChirpApplication

fun main(args: Array<String>) {
    Test()
	runApplication<ChirpApplication>(*args)
}

//@Component
//class Demo(
//    private val userRepo: UserRepository,
//) {
//    @PostConstruct
//    fun init() {
//        userRepo.save(UserEntity(
//            email = "test@test.com",
//            username = "test",
//            hashedPassword = "123"
//        ))
//    }
//}
