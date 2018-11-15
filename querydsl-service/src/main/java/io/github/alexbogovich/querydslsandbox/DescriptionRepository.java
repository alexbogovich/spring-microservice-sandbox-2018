package io.github.alexbogovich.querydslsandbox;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DescriptionRepository extends MongoRepository<Description, String> {
    Page<Description> findByOrderByScoreDesc(@Param("text") TextCriteria text, Pageable page);
    Page<Description> findDistinctByOrderByScoreDesc(@Param("text") TextCriteria text, Pageable page);
}
