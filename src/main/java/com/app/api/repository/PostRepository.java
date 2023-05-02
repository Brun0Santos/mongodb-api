package com.app.api.repository;

import com.app.api.entities.PostEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<PostEntity, String> {
}
