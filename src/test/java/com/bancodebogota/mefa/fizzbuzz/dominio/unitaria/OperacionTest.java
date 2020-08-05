package com.bancodebogota.mefa.fizzbuzz.dominio.unitaria;

import com.bancodebogota.mefa.fizzbuzz.dominio.Operacion;
import com.bancodebogota.mefa.fizzbuzz.infraestructura.persistencia.builder.OperacionBuilder;
import com.bancodebogota.mefa.fizzbuzz.infraestructura.persistencia.entidad.OperacionEntity;
import com.bancodebogota.mefa.fizzbuzz.testdatabuilder.OperacionTestDataBuilder;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class OperacionTest {

    public static final int MIN = 2;
    public static final int MAX = 3;
    public static final String DES_MULTIPLO_TRES = "Se encontraron múltiplos de 3";
    public static final String LIST_MULTIPLO_TRES = "2,Fizz";


    @Test
    public void creaOperacion()
    {
        //arrange
        OperacionTestDataBuilder operacionTestDataBuilder = new OperacionTestDataBuilder();
        //act
        Operacion operacion=operacionTestDataBuilder.build();
        OperacionEntity operacionEntity=OperacionBuilder.convertirAEntity(operacion);
        //asert
        assertEquals(DES_MULTIPLO_TRES, operacionEntity.getDescription());
        assertEquals(LIST_MULTIPLO_TRES, operacionEntity.getList());
        assertEquals(MIN, operacionEntity.getMin());
        assertEquals(MAX, operacionEntity.getMax());
    }
}
