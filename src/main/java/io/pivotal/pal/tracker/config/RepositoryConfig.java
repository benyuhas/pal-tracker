package io.pivotal.pal.tracker.config;

import io.pivotal.pal.tracker.repository.InMemoryTimeEntryRepository;
import io.pivotal.pal.tracker.repository.JdbcTimeEntryRepository;
import io.pivotal.pal.tracker.repository.TimeEntryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class RepositoryConfig {

    @Bean
    public TimeEntryRepository timeEntryRepository(DataSource dataSource){
        return new JdbcTimeEntryRepository(dataSource);
    }
}
