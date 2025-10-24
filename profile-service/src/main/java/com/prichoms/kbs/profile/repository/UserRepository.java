package com.prichoms.kbs.profile.repository;

import com.prichoms.kbs.profile.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User,Long> {
}
