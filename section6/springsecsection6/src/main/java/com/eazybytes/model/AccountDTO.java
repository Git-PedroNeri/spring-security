package com.eazybytes.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * @author pedro.neri
 * @project springsecsection6
 * @email pedro.neri@
 * @createat 11/10/2023
 */

@SuperBuilder
@Data
public class AccountDTO {

    String name;
}
