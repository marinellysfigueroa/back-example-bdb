package com.bancodebogota.mefa.fizzbuzz.dominio.repositorio;

import com.bancodebogota.mefa.fizzbuzz.dominio.Operacion;
import com.bancodebogota.mefa.fizzbuzz.infraestructura.persistencia.entidad.OperacionEntity;

import java.util.List;

public interface RepositorioOperacion {
    OperacionEntity findByTimestamp(Long timestamp);
    List<Operacion> listarOperaciones();
    Operacion registrarOperacion(Operacion operacion);
}
