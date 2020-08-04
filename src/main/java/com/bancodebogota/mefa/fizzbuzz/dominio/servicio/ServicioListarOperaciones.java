package com.bancodebogota.mefa.fizzbuzz.dominio.servicio;

import com.bancodebogota.mefa.fizzbuzz.dominio.Operacion;
import com.bancodebogota.mefa.fizzbuzz.dominio.repositorio.RepositorioOperacion;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioListarOperaciones {
    private RepositorioOperacion repositorioOperacion;

    public ServicioListarOperaciones(RepositorioOperacion repositorioOperacion) {
        this.repositorioOperacion = repositorioOperacion;
    }
    public List<Operacion> listarOperaciones(){
        return this.repositorioOperacion.listarOperaciones();
    }
}
