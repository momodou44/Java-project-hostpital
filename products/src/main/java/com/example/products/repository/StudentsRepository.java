package com.example.products.repository;

import com.example.products.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Students,Long> {

    //List<Students> findByFirstNameContains(String mc);

    @Query("select s from Students s where s.firstname like :x")
    List<Students> search(@Param("x") String mc);
}
