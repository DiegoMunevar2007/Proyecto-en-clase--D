package com.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

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
