package com.app.service;



import com.app.entity.University;
import com.app.repo.UniversityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepo universityRepo;

    @Override
    public University createUniversityProfile(University university) {
        return universityRepo.save(university);
    }
}