package com.bancodebogota.mefa.fizzbuzz.infraestructura.persistencia.repositorio.jpa;

import com.bancodebogota.mefa.fizzbuzz.dominio.Operacion;

import java.util.List;

public interface RepositorioOperacionJPA {
    List<Operacion> listarOperaciones();
}
