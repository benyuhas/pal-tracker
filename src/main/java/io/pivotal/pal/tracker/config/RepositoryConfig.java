package io.pivotal.pal.tracker.config;

import io.pivotal.pal.tracker.InMemoryTimeEntryRepository;
import io.pivotal.pal.tracker.TimeEntryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public TimeEntryRepository timeEntryRepository(){
        return new InMemoryTimeEntryRepository();
    }
}
