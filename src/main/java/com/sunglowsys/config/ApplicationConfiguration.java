package com.sunglowsys.config;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Candidate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public Candidate getCondidate(){
        return new Candidate();
    }

    @Bean
    public Address getAddress(){
        return new Address();
    }
}
