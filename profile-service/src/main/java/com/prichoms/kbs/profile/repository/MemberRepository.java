package com.prichoms.kbs.profile.repository;

import com.prichoms.kbs.profile.model.Member;
import com.prichoms.kbs.profile.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository <Member,Long> {
}
