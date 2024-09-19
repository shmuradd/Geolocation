package com.example.demo.repositories;

import com.example.demo.model.Doctor;
import org.hibernate.sql.exec.internal.JdbcParameterBindingImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByCity(String city);
}