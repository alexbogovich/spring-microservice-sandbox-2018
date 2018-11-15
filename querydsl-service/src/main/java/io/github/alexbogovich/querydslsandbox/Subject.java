package io.github.alexbogovich.querydslsandbox;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.TextScore;

import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
class Subject {
	@Id
	private String id;
	private Integer code;
	@DBRef
	private List<Description> descriptions;
}
