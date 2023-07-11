package com.vitalconsult.Vitalconsultback.Controllers;


import com.vitalconsult.Vitalconsultback.Entity.Citas;
import com.vitalconsult.Vitalconsultback.Entity.exceptions.ResourceNotFoundException;
import com.vitalconsult.Vitalconsultback.Services.CitasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cita")
@CrossOrigin("*")
public class CitasControllers {

    @Autowired
    private CitasServices citasServices;

    @PostMapping("/agregar")
    public ResponseEntity<Citas> guardarLCita(@RequestBody Citas citas){
        Citas citaGuardado = citasServices.agregarCita(citas);
        return ResponseEntity.ok(citaGuardado);
    }


    @GetMapping("/{idCitas}")
    public ResponseEntity<Citas> listarCitasPorId(@PathVariable(value = "idCitas") Long idCitas)
            throws ResourceNotFoundException {
        Citas citas = citasServices.obtenerCitas(idCitas);
        if (citas == null) {
            throw new ResourceNotFoundException("Cita no encontrado con el ID: " + idCitas);
        }
        return ResponseEntity.ok(citas);
    }


    @GetMapping("/listar")
    public ResponseEntity<?> listarCitas(){
        return ResponseEntity.ok(citasServices.obtenerCitas());
    }

    @PutMapping("/modificar")
    public Citas actualizarCita(@RequestBody Citas citas){
        return citasServices.actualizarCita(citas);
    }

    @DeleteMapping("/eliminar/{idCitas}")
    public void eliminarCita(@PathVariable("idCitas") Long idCitas){
        citasServices.eliminarCitas(idCitas);
    }


}
