package com.app.service;



import com.app.entity.College;
import com.app.repo.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepo collegeRepo;

    @Override
    public College createCollegeProfile(College college) {
        return collegeRepo.save(college);
    }
}