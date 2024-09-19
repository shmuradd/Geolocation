package com.example.demo.controllers;

import com.example.demo.model.Doctor;
import com.example.demo.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // Search doctors by city (manually input or auto-filled by geolocation)
    @PostMapping("/searchDoctors")
    public ResponseEntity<List<Doctor>> searchDoctors(@RequestParam("city") String city) {
        List<Doctor> doctors = doctorService.findDoctorsByCity(city);
        return ResponseEntity.ok(doctors);
    }

    // Add doctors with clinic information
    @GetMapping("/addDoctors")
    public String addDoctors() {
        doctorService.addDoctor(new Doctor("Dr. Smith", "Sumgayıt", "Sumgait Clinic"));
        doctorService.addDoctor(new Doctor("Dr. John", "Baku", "Baku Health Center"));
        return "Doctors added!";
    }
}
