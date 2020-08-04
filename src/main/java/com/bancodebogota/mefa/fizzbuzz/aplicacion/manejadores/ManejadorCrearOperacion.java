package com.bancodebogota.mefa.fizzbuzz.aplicacion.manejadores;

import com.bancodebogota.mefa.fizzbuzz.aplicacion.comando.ComandoOperacion;
import com.bancodebogota.mefa.fizzbuzz.aplicacion.fabrica.FabricaOperacion;
import com.bancodebogota.mefa.fizzbuzz.dominio.Operacion;
import com.bancodebogota.mefa.fizzbuzz.dominio.servicio.ServicioCrearOperacion;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManejadorCrearOperacion {
    private final ServicioCrearOperacion servicioCrearOperacion;
    private final FabricaOperacion fabricaOperacion;

    public ManejadorCrearOperacion(ServicioCrearOperacion servicioCrearOperacion, FabricaOperacion fabricaOperacion) {
        this.servicioCrearOperacion = servicioCrearOperacion;
        this.fabricaOperacion = fabricaOperacion;
    }
    @Transactional
    public Operacion registrarOperacion(ComandoOperacion comandoOperacion)
    {
        Operacion operacion=this.fabricaOperacion.crearOperacion(comandoOperacion);
        return this.servicioCrearOperacion.registrarOperacion(operacion);
    }
}
