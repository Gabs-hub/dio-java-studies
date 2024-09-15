package org.example.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Gabs", LocalDateTime.of(2005,5,26,7,0,0));
        Assertions.assertEquals(19,pessoa.getIdade());
    }
}