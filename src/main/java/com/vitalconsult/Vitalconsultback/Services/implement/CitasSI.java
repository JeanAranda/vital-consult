package com.vitalconsult.Vitalconsultback.Services.implement;


import com.vitalconsult.Vitalconsultback.Entity.Citas;
import com.vitalconsult.Vitalconsultback.Repository.CitasRepository;
import com.vitalconsult.Vitalconsultback.Services.CitasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CitasSI implements CitasServices {
    @Autowired
    private CitasRepository citasRepository;
    @Override
    public Citas agregarCita(Citas citas) {
        return citasRepository.save(citas);
    }

    @Override
    public Citas actualizarCita(Citas citas) {
        return citasRepository.save(citas);
    }

    @Override
    public Set<Citas> obtenerCitas()  {
        return new LinkedHashSet<>(citasRepository.findAll());
    }

    @Override
    public Citas obtenerCitas(Long idCitas) {
        return citasRepository.findById(idCitas).get();
    }

    @Override
    public void eliminarCitas(Long idCitas) {
        Citas citas = new Citas();
        citas.setIdCitas(idCitas);
        citasRepository.delete(citas);
    }
}
