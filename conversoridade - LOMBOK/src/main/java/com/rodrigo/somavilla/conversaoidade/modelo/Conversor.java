package com.rodrigo.somavilla.conversaoidade.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Conversor {
    @Getter @Setter
    private int idade;

    public int converterMeses(){
        return idade * 12;
    }
    public int converterSemanas(){
        return idade * 12 * 4;
    }
    public int converterDias(){
        return idade * 365;
    }
}
