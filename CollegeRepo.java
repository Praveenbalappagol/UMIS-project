package com.app.repo;


import com.app.entity.College;
import com.app.repo.CollegeRepo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepo extends JpaRepository<College, Long> {
}