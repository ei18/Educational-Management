package com.riwi.educationalManagement.infraestructure.abstract_service;

import com.riwi.educationalManagement.api.dto.request.AssignmentRequest;
import com.riwi.educationalManagement.api.dto.response.AssignmentResponse;

public interface IAssignmentService extends CrudServices<AssignmentRequest, AssignmentResponse, Long>{
}
