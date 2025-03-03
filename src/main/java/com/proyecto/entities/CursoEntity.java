package com.proyecto.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CursoEntity extends BaseEntity{
    private String codigo;
    private String semestre;
    private String nombreLargo;
    private String nombreCorto;


}
