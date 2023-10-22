package com.eazybytes.config.properties;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @author pedro.neri
 * @project springsecsection_13
 * @email pedro.neri@
 * @createat 22/10/2023
 */

@Configuration
@Log4j2
public class TestPropertiesValue implements ApplicationRunner {

    @Autowired
    EazyByteProperty eazyByteProperty;

    @PostConstruct
    public void test() {
        log.info(eazyByteProperty.getSeguranca().isEnableHttps());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info(eazyByteProperty.getSeguranca().isEnableHttps());

    }
}
