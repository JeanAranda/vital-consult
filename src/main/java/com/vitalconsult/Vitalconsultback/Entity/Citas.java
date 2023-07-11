package com.vitalconsult.Vitalconsultback.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "citas")
@Data
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCitas;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String especialidades;
    private String horario;
    private String doctor;

    public Citas(){

    }
}
