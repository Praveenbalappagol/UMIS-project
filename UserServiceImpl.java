package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.app.entity.Admin;
import com.app.entity.University;
import com.app.entity.User;
import com.app.repo.AdminRepo;
import com.app.repo.UserRepo;
import com.app.entity.*;
@Service
public  class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private AdminRepo adminRepo;
    
    
//@Autowired
//    private UniversityRepo universityRepo;
        
    @Override
    public void registerUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void adminRegister(Admin admin) {
        adminRepo.save(admin);
    }
//    @Override
//    public void universityregister(University university) {
//    	UniversityRepo.save(university);
    }

