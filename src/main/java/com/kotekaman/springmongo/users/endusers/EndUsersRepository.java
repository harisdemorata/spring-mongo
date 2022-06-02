package com.kotekaman.springmongo.users.endusers;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EndUsersRepository extends MongoRepository<EndUser,String> {
    Optional<EndUser> findEndUsersRepositoryByEmail (String email);
}
