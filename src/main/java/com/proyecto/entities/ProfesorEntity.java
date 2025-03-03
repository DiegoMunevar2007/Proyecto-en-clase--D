package com.proyecto.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@Data
@Entity
public class ProfesorEntity extends BaseEntity{

    PodamFactoryImpl a = new PodamFactoryImpl();
    private String login;
    private String nombre;
    private String cedula;
}
