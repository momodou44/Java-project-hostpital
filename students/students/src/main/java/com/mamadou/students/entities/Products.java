package com.mamadou.students.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Products {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private String name;
    private Integer quantity;
}
