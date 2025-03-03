package com.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Data
@Entity

public class ProgramaEntity extends BaseEntity{
    private String nombre;
    @OneToMany(mappedBy = "codigo")
    private List<CursoEntity> curso = new ArrayList<>();
}
