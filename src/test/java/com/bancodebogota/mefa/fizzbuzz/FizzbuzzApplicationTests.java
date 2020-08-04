package com.bancodebogota.mefa.fizzbuzz;

import com.bancodebogota.mefa.fizzbuzz.dominio.unitaria.OperacionTest;
import com.bancodebogota.mefa.fizzbuzz.infraestructura.ControladorOperacionTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {OperacionTest.class,
                ControladorOperacionTest.class
        })
public class FizzbuzzApplicationTests {

    @Test
    public void contextLoads() {
    }

}
