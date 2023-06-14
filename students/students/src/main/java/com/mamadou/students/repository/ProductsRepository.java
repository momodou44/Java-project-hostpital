package com.mamadou.students.repository;

import com.mamadou.students.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products,Long> {

     List<Products> findByNameContains(String mc);

     @Query("select p from products p where p.name like :x")
    List<Products> search(@Param("x") String mc );
}
