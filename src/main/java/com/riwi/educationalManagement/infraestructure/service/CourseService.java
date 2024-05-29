package com.riwi.educationalManagement.infraestructure.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.educationalManagement.api.dto.request.CourseRequest;
import com.riwi.educationalManagement.api.dto.response.CourseResponse;
import com.riwi.educationalManagement.infraestructure.abstract_service.ICourseService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class CourseService implements ICourseService{
    @Override
    public CourseResponse create(CourseRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CourseResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Page<CourseResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public CourseResponse update(CourseRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
