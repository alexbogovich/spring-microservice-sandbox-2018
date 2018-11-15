package io.github.alexbogovich.querydslsandbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.mongodb.core.query.TextCriteria;

import java.util.regex.Pattern;

import static org.springframework.data.mongodb.core.query.TextCriteria.forDefaultLanguage;
import static org.springframework.data.mongodb.core.query.TextCriteria.forLanguage;

@ReadingConverter
@Slf4j
public class StringToTextCriteriaConverter implements Converter<String, TextCriteria> {

    @Override
    public TextCriteria convert(String source) {
        boolean cyrillic = Pattern.matches(".*\\p{InCyrillic}.*", source);
        log.info(source + " is rus " + cyrillic);
        if (source.contains(" ")) {
            log.info("as phrase");
            if (cyrillic) return forLanguage("ru").matchingAny(source.split(" "));
            return forDefaultLanguage().matchingAny(source.split(" "));
        }
        log.info("as word");
        if (cyrillic) forLanguage("ru").matchingAny(source.split(" "));
        return forDefaultLanguage().matchingAny(source);
    }
}
