package com.eazybytes.model;

import lombok.Data;

/**
 * @author pedro.neri
 * @project springsecsection3
 * @email pedro.neri@
 * @createat 09/10/2023
 */

@Data
public class Funcionario {
    private String name;
    private Strategy cargo;
}
