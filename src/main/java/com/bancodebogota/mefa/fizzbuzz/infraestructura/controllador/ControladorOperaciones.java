package com.bancodebogota.mefa.fizzbuzz.infraestructura.controllador;

import com.bancodebogota.mefa.fizzbuzz.aplicacion.comando.ComandoOperacion;
import com.bancodebogota.mefa.fizzbuzz.aplicacion.manejadores.ManejadorCrearOperacion;
import com.bancodebogota.mefa.fizzbuzz.aplicacion.manejadores.ManejadorListarOperaciones;
import com.bancodebogota.mefa.fizzbuzz.dominio.Operacion;
import com.bancodebogota.mefa.fizzbuzz.dominio.exepcion.ErrorRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/bancodebogota/api/fizzbuzz/")
public class ControladorOperaciones {
    public static final String URL_BASE = "/bancodebogota/api/fizzbuzz/";
    private final ManejadorCrearOperacion manejadorCrearOperacion;
    private final ManejadorListarOperaciones manejadorListarOperaciones;


    public ControladorOperaciones(ManejadorCrearOperacion manejadorCrearOperacion, ManejadorListarOperaciones manejadorListarOperaciones) {
        this.manejadorCrearOperacion = manejadorCrearOperacion;
        this.manejadorListarOperaciones = manejadorListarOperaciones;

    }

    @GetMapping("listar")
    public List<Operacion> listarOperaciones() {
        return this.manejadorListarOperaciones.listarOperaciones();
    }


    @RequestMapping("/{min}/{max}")
    public ResponseEntity<Object> registrarOperacion(@PathVariable(name = "min") int min, @PathVariable(name = "max") int max){
        if(max>min)
        {
            ComandoOperacion comandoOperacion=new ComandoOperacion(min,max);
            return new ResponseEntity<Object>(this.manejadorCrearOperacion.registrarOperacion(comandoOperacion), HttpStatus.OK);
        }else
        {
            ErrorRequest errorRequest =new ErrorRequest(URL_BASE +min+"/"+max);
            return new ResponseEntity<Object>(errorRequest.toString(), HttpStatus.BAD_REQUEST);
        }


    }

}
