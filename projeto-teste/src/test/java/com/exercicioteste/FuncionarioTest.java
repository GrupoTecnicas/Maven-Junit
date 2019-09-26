package com.exercicioteste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    private Funcionario f;

    @BeforeEach
    public void setup(){
        f = new Funcionario();
    }

    @Test
    public void testINSSmenorLimite(){
        f.setSalarioBruto(3000.0);
        double rEsp = 3000.0*0.045;
        double rObs = f.getINSS();
        assertEquals(rEsp,rObs,0.0001);
    }
    
    @Test
    public void testINSSigualLimite(){
        f.setSalarioBruto(5000.0);
        double rEsp = 5000.0*0.045;
        double rObs = f.getINSS();
        assertEquals(rEsp,rObs,0.0001);
    }

    @Test
    public void testIRmaior(){
        f.setSalarioBruto(3000.0);
        double rEsp = 3000.0 * 0.12;
        double rObs = f.getIRPF();
        assertEquals(rEsp, rObs, 0.0001);
    }

    @Test
    public void testIRigual(){
        f.setSalarioBruto(2500.0);
        double rEsp = 2500.0 * 0.12;
        double rObs = f.getIRPF();
        assertEquals(rEsp, rObs, 0.0001);
    }
}