package com.example.products.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Students {
    private String firstname;
    private String lastname;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    private String classname;

}
