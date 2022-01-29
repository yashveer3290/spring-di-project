package com.sunglowsys.test;

import com.sunglowsys.config.ApplicationConfiguration;
import com.sunglowsys.domain.Candidate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeatCandidate {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Candidate candidate = (Candidate) context.getBean(Candidate.class);
        System.out.println();
        candidate.setFirstName("yash");
        candidate.setLastName("kumar");

        System.out.println("Candidate Name:"+candidate.getFirstName());
        System.out.println("Candidate Name:"+candidate.getLastName());
        System.out.println();
        candidate.newAddress();
    }
}
