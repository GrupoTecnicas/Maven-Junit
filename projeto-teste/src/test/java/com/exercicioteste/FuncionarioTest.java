package com.exercicioteste;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    private Funcionario f;

    @Test
    public void setSalarioBrutoTest(double salarioBruto){
        f.setSalarioBruto(salarioBruto);
        assertEquals(salarioBruto, f.getSalarioBruto());
    }
    
}