package com.hexgon.school_service.service;


import com.hexgon.school_service.entity.School;
import com.hexgon.school_service.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public School addSchool(School school){
        return schoolRepository.save(school);
    }
    public List<School> fetchSchools(){
        return schoolRepository.findAll();
    }
    public School fetchSchoolById(int id){
        return schoolRepository.findById(id).orElse(null);
    }
}
