package com.eazybytes;

import com.eazybytes.config.properties.EazyByteProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
@EnableConfigurationProperties(EazyByteProperty.class)
public class EazyBankBackendApplication {


    public static void main(String[] args) {
        SpringApplication.run(EazyBankBackendApplication.class, args);

    }

}
