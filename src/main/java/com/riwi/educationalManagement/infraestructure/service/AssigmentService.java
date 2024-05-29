package com.riwi.educationalManagement.infraestructure.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.educationalManagement.api.dto.request.AssignmentRequest;
import com.riwi.educationalManagement.api.dto.response.AssignmentResponse;
import com.riwi.educationalManagement.infraestructure.abstract_service.IAssignmentService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AssigmentService implements IAssignmentService{
    @Override
    public AssignmentResponse create(AssignmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public AssignmentResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Page<AssignmentResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public AssignmentResponse update(AssignmentRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
