package com.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class CursoEntity extends BaseEntity{
    private String codigo;
    private String semestre;
    private String nombreLargo;
    private String nombreCorto;

    @PodamExclude
    @OneToMany
    private List<SeccionEntity> secciones = new ArrayList<SeccionEntity>();

    @PodamExclude
    @ManyToOne
    private ProgramaEntity programa;

}
