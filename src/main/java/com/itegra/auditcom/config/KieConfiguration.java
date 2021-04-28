package com.itegra.auditcom.config;

import org.drools.core.io.impl.ClassPathResource;
import org.drools.core.io.impl.FileSystemResource;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KieConfiguration {

    private final Logger log = LoggerFactory.getLogger(KieConfiguration.class);

    public static final String drlFile = "rules";

    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        ClassPathResource classPathResource = new ClassPathResource(drlFile);
        if(classPathResource.isDirectory()) {
            classPathResource.listResources()
                .forEach(file -> {
                    FileSystemResource fResource = ((FileSystemResource)file);
                    log.debug("Writting file: " + fResource.getFile().getName());
                    kieFileSystem.write(fResource);
                });
        } else {
            kieFileSystem.write(ResourceFactory.newClassPathResource(drlFile));
        }

        //kieFileSystem.write(ResourceFactory.newClassPathResource(drlFile));

        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}
