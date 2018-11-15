package io.github.alexbogovich.querydslsandbox;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = {Subject.class})
public interface SubjectWithDescProjection {
    Integer getCode();
    List<Description> getDescriptions();
}
