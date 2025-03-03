package com.proyecto.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;


@Data
@MappedSuperclass
public class BaseEntity {

    @GeneratedValue
    protected Long id;
}
