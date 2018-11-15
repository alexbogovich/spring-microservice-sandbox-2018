package io.github.alexbogovich.querydslsandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;

@Configuration
public class TextCriteriaConfiguration {
    private final GenericConversionService genericConversionService;

    @Autowired
    public TextCriteriaConfiguration(@Qualifier("defaultConversionService") GenericConversionService genericConversionService) {
        this.genericConversionService = genericConversionService;
    }

    @Bean
    public StringToTextCriteriaConverter stringToTextCriteriaConverter(){
        StringToTextCriteriaConverter stringToTextCriteriaConverter = new StringToTextCriteriaConverter();
        genericConversionService.addConverter(stringToTextCriteriaConverter);
        return stringToTextCriteriaConverter;
    }

}
