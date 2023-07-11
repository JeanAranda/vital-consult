package com.vitalconsult.Vitalconsultback.Services;


import com.vitalconsult.Vitalconsultback.Entity.Citas;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CitasServices {
    Citas agregarCita(Citas citas);

    Citas actualizarCita(Citas citas);

    Set<Citas> obtenerCitas();

    Citas obtenerCitas(Long idCitas);

    void eliminarCitas(Long idCitas);
}
