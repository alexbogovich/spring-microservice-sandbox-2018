package io.github.alexbogovich.querydslsandbox;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Language;
import org.springframework.data.mongodb.core.mapping.TextScore;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@EqualsAndHashCode(of = {"value", "language"})
public class Description {
    @Id
    private String id;

    @TextIndexed
    private String value;

    @Language
    private String language;

    @TextScore
    private Double score;
}
