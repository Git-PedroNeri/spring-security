package com.eazybytes.enuns;

import com.eazybytes.model.Strategy;

/**
 * @author pedro.neri
 * @project springsecsection3
 * @email pedro.neri@
 * @createat 09/10/2023
 */
public enum Cargo implements Strategy {


    ATENDENTE {
        @Override
        public double calcularComissao(double valorVenda) {
            return valorVenda * 0.50;
        }
    },
    VENDEDOR {
        @Override
        public double calcularComissao(double valorVenda) {
            return (valorVenda * 0.40);
        }
    },
    GERENTE {
        @Override
        public double calcularComissao(double valorVenda) {
            return (valorVenda * 0.80);
        }
    };


}
