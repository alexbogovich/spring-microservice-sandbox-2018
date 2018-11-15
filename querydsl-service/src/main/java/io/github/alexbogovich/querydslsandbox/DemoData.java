package io.github.alexbogovich.querydslsandbox;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static java.util.Arrays.asList;

@Component
@RequiredArgsConstructor
class DemoData implements ApplicationRunner {

    private final SubjectRepository subjectRepository;

    private final DescriptionRepository descriptionRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        descriptionRepository.deleteAll();
        subjectRepository.deleteAll();
        subjectRepository.saveAll(
                asList(
                        new Subject(null, 1, descriptionRepository.saveAll(asList(
                                new Description(null, "Shop Prana! 15% OFF SITEWIDE! Use Code BFRIDAY15", "en", null),
                                new Description(null, "Привет", "ru", null),
                                new Description(null, "PRANA - Organic &amp; Vegan Foods 1", "en", null),
                                new Description(null, "Как дела", "ru", null)
                        ))/*, null*/),
                        new Subject(null, 1, descriptionRepository.saveAll(asList(
                                new Description(null, "Как дела", "ru", null),
                                new Description(null, "Как дела", "ru", null),
                                new Description(null, "Text Link", "en", null),
                                new Description(null, "Text Link", "en", null)
                        ))/*, null*/),
                        new Subject(null, 2, descriptionRepository.saveAll(asList(
                                new Description(null, "Text Link", "en", null),
                                new Description(null, "Text Link", "en", null),
                                new Description(null, "Иди нахуй", "ru", null),
                                new Description(null, "Иди нахуй", "ru", null),
                                new Description(null, "OMG HONOR", "ru", null),
                                new Description(null, "OMG HONOR", "ru", null)
                        ))/*, null*/)
                )
        );
    }
}
