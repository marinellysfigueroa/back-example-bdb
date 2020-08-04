package com.bancodebogota.mefa.fizzbuzz.dominio.servicio;

import com.bancodebogota.mefa.fizzbuzz.dominio.Operacion;
import com.bancodebogota.mefa.fizzbuzz.dominio.repositorio.RepositorioOperacion;
import org.springframework.stereotype.Component;

@Component
public class ServicioCrearOperacion {
    private RepositorioOperacion repositorioOperacion;

    public ServicioCrearOperacion(RepositorioOperacion repositorioOperacion) {
        this.repositorioOperacion = repositorioOperacion;
    }
    public Operacion registrarOperacion(Operacion operacion){
        return this.repositorioOperacion.registrarOperacion(operacion);
    }
}
