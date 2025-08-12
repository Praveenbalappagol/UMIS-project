package com.app.repo;


import com.app.entity.University;
import com.app.repo.UniversityRepo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepo extends JpaRepository<University, Long> {
}