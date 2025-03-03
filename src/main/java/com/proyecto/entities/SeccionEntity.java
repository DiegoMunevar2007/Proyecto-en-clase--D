package com.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class SeccionEntity extends BaseEntity{

    private int numero;
    private String salon;
    private String semestre;

    @PodamExclude
    @ManyToMany(mappedBy = "profesor", fetch = FetchType.LAZY)
    private List<ProfesorEntity> profesores = new ArrayList<>();

    
}
