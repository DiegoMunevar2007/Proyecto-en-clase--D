package com.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class EstudianteEntity extends BaseEntity{
    private String login;
    private String nombre;
    private String codigo;

    // Relaciones
    @PodamExclude
    @OneToOne
    private ProgramaEntity programa;

    @PodamExclude
    @OneToMany
    private List<InscripcionEntity> inscripciones = new ArrayList<InscripcionEntity>();

}
