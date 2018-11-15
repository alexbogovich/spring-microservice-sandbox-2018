package io.github.alexbogovich.userservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UserController(private val userRepository: UserRepository) {
    @GetMapping("/names")
    fun getUsers(): String {
        return userRepository.findAll()
                .map { it.name  }
                .toMutableList()
                .joinToString()
    }
}
