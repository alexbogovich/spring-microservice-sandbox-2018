package io.github.alexbogovich.querydslsandbox;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = SubjectWithDescProjection.class)
interface SubjectRepository extends MongoRepository<Subject, String>, QuerydslPredicateExecutor<Subject> {
}
