package com.bancodebogota.mefa.fizzbuzz.aplicacion.manejadores;

import com.bancodebogota.mefa.fizzbuzz.aplicacion.fabrica.FabricaOperacion;
import com.bancodebogota.mefa.fizzbuzz.dominio.Operacion;
import com.bancodebogota.mefa.fizzbuzz.dominio.servicio.ServicioListarOperaciones;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ManejadorListarOperaciones {
    private final ServicioListarOperaciones servicioListarOperaciones;
    private final FabricaOperacion fabricaOperacion;

    public ManejadorListarOperaciones(ServicioListarOperaciones servicioListarOperaciones, FabricaOperacion fabricaOperacion) {
        this.servicioListarOperaciones = servicioListarOperaciones;
        this.fabricaOperacion = fabricaOperacion;
    }

    public List<Operacion> listarOperaciones()
    {
        return  this.servicioListarOperaciones.listarOperaciones();
    }
}
