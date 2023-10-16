package com.eazybytes.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author pedro.neri
 * @project springsecsection7
 * @email pedro.neri@
 * @createat 16/10/2023
 */
@Slf4j
@Configuration
public class TesteEncoder implements CommandLineRunner {

    @Autowired
    PasswordEncoder encoder;


    @Override
    public void run(String... args) throws Exception {
        log.info(encoder.encode("12345"));
        log.info(encoder.encode("54321"));
        log.info(encoder.encode("qazwsx"));
    }
}
