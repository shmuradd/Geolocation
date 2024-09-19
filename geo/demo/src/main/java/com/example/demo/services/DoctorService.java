package com.example.demo.services;

import com.example.demo.model.Doctor;
import com.example.demo.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // Add a new doctor with city and clinic information
    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    // Find doctors by city
    public List<Doctor> findDoctorsByCity(String city) {
        return doctorRepository.findByCity(city);
    }
}