package com.example.mvc.repository;

import com.example.mvc.entities.Patient1;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRe extends JpaRepository<Patient1,Long> {
    Page<Patient1> findByNomContains(String Keyword, Pageable pageable);
    @Query("select page from Patient1 page  where page.nom like :x")
    Page<Patient1> search(@Param("x") String Keyword,Pageable pageable);
}
