package org.example.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class PessoaTest {

    @Test
    void calcularIdadeCorrretamente(){
        Pessoa pessoa = new Pessoa("Nobru", LocalDateTime.of(1998, 5,20,12,0,0));
        Assertions.assertEquals(26,pessoa.getIdade());
    }

    @Test
    void retornarMaiorDeIdade(){
        Pessoa pessoa1 = new Pessoa("Gohan", LocalDateTime.of(2000,1,1,1,1,1));
        Assertions.assertTrue(pessoa1.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Leticia", LocalDateTime.of(2023,1,1,1,1,1));
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }

    @Test
    void validarIgualdade() {
        Pessoa pessoa1 = new Pessoa("Pessoa 1", LocalDateTime.now());
        Pessoa pessoa2 = new Pessoa("Pessoa 2", LocalDateTime.now());

        Assertions.assertNotSame(pessoa1, pessoa2);
    }
}