package io.github.alexbogovich.userservice

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface UserRepository : MongoRepository<User, String>
