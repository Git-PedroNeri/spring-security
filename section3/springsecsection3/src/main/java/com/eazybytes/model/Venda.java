package com.eazybytes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author pedro.neri
 * @project springsecsection3
 * @email pedro.neri@
 * @createat 09/10/2023
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Venda {

    private double valorVenda;
    private Funcionario funcionario;

    //Gets e setters

    public void save() {
        /*
         * Calcula o valor da comissão de venda sem que haja a necessidade de
         * usar um switch para o tipo de cargo toda vez que o método <b>save</b> for executado.
         */
        final double valorComissao = this.funcionario.getCargo().calcularComissao(this.valorVenda);

        log.info("Funcionario {}, comissao {}",funcionario.getName(),valorComissao);

    }
}
