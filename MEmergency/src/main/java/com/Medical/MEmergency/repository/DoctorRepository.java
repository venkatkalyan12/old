package com.Medical.MEmergency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Medical.MEmergency.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
