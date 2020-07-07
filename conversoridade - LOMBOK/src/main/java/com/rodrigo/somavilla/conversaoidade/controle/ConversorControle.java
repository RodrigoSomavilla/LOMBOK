package com.rodrigo.somavilla.conversaoidade.controle;

import com.rodrigo.somavilla.conversaoidade.modelo.Conversor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorControle {

    @GetMapping("/")
    public String mensagem1(){
        return "Bem Vindo ao Somavillas World";
    }
    @GetMapping("/conversor")
    public String CalcularConversao(){

        Conversor conversor = new Conversor();

        conversor.setIdade(18);
        return "Resultado em Meses: "+ conversor.converterMeses()+
                "\nResultado em Semanas: "+ conversor.converterSemanas()+
                "\nResultado em Dias: "+ conversor.converterDias();
    }
}
