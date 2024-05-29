package com.riwi.educationalManagement.infraestructure.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.educationalManagement.api.dto.request.LessonRequest;
import com.riwi.educationalManagement.api.dto.response.LessonResponse;
import com.riwi.educationalManagement.infraestructure.abstract_service.ILessonService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class LessonService implements ILessonService{
    @Override
    public LessonResponse create(LessonRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public LessonResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Page<LessonResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public LessonResponse update(LessonRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
