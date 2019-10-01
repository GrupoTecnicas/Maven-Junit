package com.exercicioteste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FuncionarioTest {

    private Funcionario f;

    @BeforeEach
    public void setup(){
        f = new Funcionario();
    }

    @DisplayName("Testa valores de IRPF")
    @ParameterizedTest
    @CsvSource({"1000.0,0.0", "2500.0,0.0", "3000.0,60.0"})
    public void testIRPF(double val, double rEsp){
        f.setSalarioBruto(val);
        double rObs = f.getIRPF();
        assertEquals(rEsp,rObs,0.001);
    }

    /*
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
    */
}