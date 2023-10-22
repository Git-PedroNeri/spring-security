package com.eazybytes.config.properties;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author pedro.neri
 * @project springsecsection_13
 * @email pedro.neri@
 * @createat 22/10/2023
 */
@ConfigurationProperties("application")
@Getter
public class EazyByteProperty {

    private final Seguranca seguranca = new Seguranca();
    @Data
    public static class Seguranca {
        private boolean enableHttps;
    }


}
